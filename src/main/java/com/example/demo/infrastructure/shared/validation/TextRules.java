package com.example.demo.infrastructure.shared.validation;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

public final class TextRules {

    // Буквы всех языков + диакритика + базовая пунктуация
    private static final Pattern LETTER_TEXT =
            Pattern.compile("^[\\p{L}\\p{M}\\p{N}\\s\\-'.,]+$");

    private TextRules() {}

    // 1. Нормализация
    public static String normalize(String raw) {
        Objects.requireNonNull(raw, "Text required");

        String n = Normalizer.normalize(raw, Normalizer.Form.NFC)
                .strip()
                .replaceAll("\\s+", " ");

        return n;
    }

    // 2. Валидация длины
    public static void validateLength(String text, int min, int max) {
        int len = text.codePointCount(0, text.length());
        if (len < min || len > max) {
            throw new IllegalArgumentException(
                    "Text length must be between " + min + " and " + max
            );
        }
    }

    // 3. Валидация допустимых символов
    public static void validateCharacters(String text) {
        if (!LETTER_TEXT.matcher(text).matches()) {
            throw new IllegalArgumentException("Text contains invalid characters");
        }
    }

    // 4. Общие пунктуационные ограничения
    public static void validatePunctuation(String text) {
        if (text.startsWith("-") || text.endsWith("-")) {
            throw new IllegalArgumentException("Text has invalid punctuation");
        }
    }

    // 5. Каноникал (для equals / uniqueness)
    public static String canonical(String text) {
        return Normalizer.normalize(text, Normalizer.Form.NFC)
                .toLowerCase(Locale.ROOT)
                .strip();
    }
}


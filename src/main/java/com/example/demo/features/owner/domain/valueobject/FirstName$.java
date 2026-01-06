package com.example.demo.features.owner.domain.valueobject;
import java.text.Normalizer;
import java.util.Locale;
import java.util.Objects;

public final class FirstName$ {

    private final String firstName;
    private final String canonical; // для equals/hashCode

    private FirstName$(String firstName) {
        this.firstName = validateName(firstName);
        this.canonical = canonical(this.firstName);
    }

    public static FirstName$ of(String firstName) {
        return new FirstName$(firstName);
    }

    public String value() { return firstName;}

    // ---------- validation helpers ----------

    private static void validate(boolean condition, String message) {
        if (!condition) { throw new IllegalArgumentException(message);}
    }

    private static String validateName(String name) {
        // 1. null + Unicode normalize
        String normalized = Normalizer.normalize(
                Objects.requireNonNull(name, "Name required"),
                Normalizer.Form.NFC
        );

        // 2. trim + collapse spaces
        String trimmed = normalized.strip().replaceAll("\\s+", " ");

        // 3. basic checks
        validate(!trimmed.isEmpty(), "Name cannot be empty");

        int length = trimmed.codePointCount(0, trimmed.length());
        validate(length >= 2 && length <= 20, "Name must be 2–20 characters");

        // 4. allowed characters (letters + accents + separators)
        validate(
                trimmed.matches("^[\\p{L}\\p{M}\\s\\-'.,]+$"),
                "Invalid characters in name"
        );

        // 5. punctuation sanity
        validate(
                !trimmed.startsWith("-") && !trimmed.endsWith("-")
                        && !trimmed.startsWith("'") && !trimmed.endsWith("'"),
                "Name cannot start or end with punctuation"
        );

        validate(
                !trimmed.matches(".*([-'.,])\\1.*"),
                "Invalid punctuation sequence in name"
        );

        return trimmed;
    }

    // ---------- equality ----------

    private static String canonical(String value) {
        return Normalizer.normalize(value, Normalizer.Form.NFC)
                .toLowerCase(Locale.ROOT)
                .strip();
    }

    @Override
    public boolean equals(Object o) {
        return this == o
                || (o instanceof FirstName$ other
                && canonical.equals(other.canonical));
    }

    @Override
    public int hashCode() { return canonical.hashCode();}

    @Override
    public String toString() { return firstName;}

}

package com.example.demo.infrastructure.shared.validation;

import java.util.Objects;

public abstract class SingleValueObject<T> {

    protected final T value;

    protected SingleValueObject(T value) {
        this.value = Objects.requireNonNull(value);
    }

    public T value() { return value;}

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleValueObject<?> that = (SingleValueObject<?>) o;
        return value.equals(that.value);
    }

    @Override
    public final int hashCode() { return value.hashCode();}

}


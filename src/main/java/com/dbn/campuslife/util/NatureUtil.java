package com.dbn.campuslife.util;

public interface NatureUtil<T> {

    default <R> T with(ConsumerOne<T, R> consumer, R value) {
        @SuppressWarnings("unchecked")
        T t = (T) this;
        consumer.accept(t, value);
        return t;
    }

    interface ConsumerOne<T, R> {
        void accept(T t, R value);
    }

}

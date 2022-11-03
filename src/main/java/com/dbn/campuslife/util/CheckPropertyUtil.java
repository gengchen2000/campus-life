package com.dbn.campuslife.util;

import org.springframework.web.servlet.HandlerInterceptor;

import java.io.Serializable;
import java.lang.reflect.Field;

public abstract class CheckPropertyUtil implements Serializable {
    public void checkProperty() {
        checkProperty(this.getClass());
    }

    private void checkProperty(Class<?> c) {
        if (c == CheckPropertyUtil.class) {
            return;
        }
        Field[] fields = c.getDeclaredFields();

    }
}

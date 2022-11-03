package com.dbn.campuslife.util;

import com.dbn.campuslife.exception.ColumnNotPropertyException;
import com.dbn.campuslife.exception.CustomException;
import io.swagger.annotations.ApiModelProperty;

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
        for (Field field : fields) {
            ApiModelProperty apiModelProperty = field.getAnnotation(ApiModelProperty.class);
            if (apiModelProperty == null) {
                return;
            }
            boolean required = apiModelProperty.required();
            if (required) {
                field.setAccessible(true);
                try {
                    Object o = field.get(this);
                    if (o == null || o instanceof String && String.valueOf(o).equals("")) {
                        throw new ColumnNotPropertyException(field.getName() + "不能为空");
                    }
                } catch (CustomException e) {
                    throw e;
                } catch (Exception e) {
                    throw new RuntimeException("程序异常");
                }

            }
        }

    }
}

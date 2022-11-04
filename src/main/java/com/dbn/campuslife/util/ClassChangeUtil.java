package com.dbn.campuslife.util;

import java.lang.reflect.Field;

public class ClassChangeUtil {
    public static <T> T toClass(Object o, Class<T> c) {
        /*获取目标类的所有属性*/
        Field[] fields = c.getDeclaredFields();
        /*源数据的实体类*/
        Class<?> oClass = o.getClass();
        T t = null;
        try {
            t = c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Field field : fields) {
            try {
                Field declaredField = oClass.getDeclaredField(field.getName());
                field.setAccessible(true);
                declaredField.setAccessible(true);
                field.set(t, declaredField.get(o));
            } catch (Exception ignore) {
            }

        }
        return t;
    }

    public static void main(String[] args) throws Exception {
        A a = new A();
        a.a = "1";
        a.b = "2";
        B b = ClassChangeUtil.toClass(a, B.class);
        System.out.println(b.a);
        System.out.println(b.c);
    }

    static class A {
        private String a;
        private String b;
    }

    static class B {
        private String a;
        private String c;
    }

}



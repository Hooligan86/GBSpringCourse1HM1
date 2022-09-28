package com.hooligan.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Polyclinic polyclinic = context.getBean("polyclinicBean", Polyclinic.class);

    }
}

package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        /*InterfaceA cA = new ClassA();
        cA.methodA();*/

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        /*InterfaceA iA = applicationContext.getBean("classB", InterfaceA.class);
        System.out.println(iA.methodA());*/

        Exam iE = applicationContext.getBean("classB", Exam.class);
        System.out.println(iE.methodA());
    }
}

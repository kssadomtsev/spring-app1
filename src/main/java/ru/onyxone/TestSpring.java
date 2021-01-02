package ru.onyxone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        TestBean testBean2 = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        System.out.println(testBean2.getName());
        context.close();
    }
}

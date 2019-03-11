package com.hyy.pattern.factory.abstractfactory;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/11 15:29
 **/
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse();
        factory.createNote();
        factory.createVideo();
    }
}

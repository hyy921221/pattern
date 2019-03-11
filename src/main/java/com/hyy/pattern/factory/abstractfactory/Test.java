package com.hyy.pattern.factory.abstractfactory;


/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:49
 **/
public class Test {
    public static void main(String[] args) {
        StudyFactory factory = new StudyFactory();
        factory.studyPattern().study();
        factory.studySpring().study();
    }
}

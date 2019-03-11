package com.hyy.pattern.factory.factorymethod;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:38
 **/
public class Test {
    public static void main(String[] args) {
        IPlanFactory factory = new StudyPlanFactory();
        factory.doSomething().doSomething();
        factory = new TrainPlanFactory();
        factory.doSomething().doSomething();
    }
}

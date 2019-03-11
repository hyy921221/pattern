package com.hyy.pattern.factory;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:26
 **/
public class TrainPlan implements IPlan {
    @Override
    public void doSomething() {
        System.out.println("跑步中。。。");
    }
}

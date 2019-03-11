package com.hyy.pattern.factory.factorymethod;

import com.hyy.pattern.factory.IPlan;
import com.hyy.pattern.factory.TrainPlan;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:38
 **/
public class TrainPlanFactory implements IPlanFactory {
    @Override
    public IPlan doSomething() {
        return new TrainPlan();
    }
}

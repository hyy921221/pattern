package com.hyy.pattern.factory.factorymethod;

import com.hyy.pattern.factory.IPlan;
import com.hyy.pattern.factory.StudyPlan;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:36
 **/
public class StudyPlanFactory implements IPlanFactory {
    @Override
    public IPlan doSomething() {
        return new StudyPlan();
    }
}

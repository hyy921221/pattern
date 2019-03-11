package com.hyy.pattern.factory.simplefactory;

import com.hyy.pattern.factory.IPlan;
import com.hyy.pattern.factory.StudyPlan;
import com.hyy.pattern.factory.TrainPlan;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:23
 **/
public class Test {
    public static void main(String[] args) {
       PlanFactory factory = new PlanFactory();
       IPlan iPlan = factory.doSomething(StudyPlan.class);
       iPlan.doSomething();
       iPlan = factory.doSomething(TrainPlan.class);
       iPlan.doSomething();
    }
}

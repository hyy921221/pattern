package com.hyy.pattern.factory.simplefactory;

import com.hyy.pattern.factory.IPlan;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:17
 **/
public class PlanFactory {

    public IPlan doSomething(Class<? extends IPlan> tClass) {
        if (tClass != null){
            try {
                return tClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

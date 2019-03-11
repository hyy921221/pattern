package com.hyy.pattern.factory.abstractfactory;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/8 15:47
 **/
public class StudyFactory implements IPlanFactory{


    @Override
    public IPattern studyPattern() {
        return new StudyPattern();
    }

    @Override
    public ISpring studySpring() {
        return new StudySpring();
    }
}

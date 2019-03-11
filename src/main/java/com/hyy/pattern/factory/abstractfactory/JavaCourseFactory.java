package com.hyy.pattern.factory.abstractfactory;

/**
 * DESC:
 * <p>
 * create by hyy on 2019/3/11 15:25
 **/
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }
}

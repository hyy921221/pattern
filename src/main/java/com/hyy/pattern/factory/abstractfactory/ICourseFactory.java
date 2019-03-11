package com.hyy.pattern.factory.abstractfactory;

public interface ICourseFactory {
    ICourse createCourse();
    IVideo createVideo();
    INote createNote();
}

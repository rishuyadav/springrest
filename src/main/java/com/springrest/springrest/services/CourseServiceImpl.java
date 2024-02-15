package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;
//    List<Course>list;
    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(145,"Java Core Course","this course contains basics of java"));
//        list.add(new Course(4343,"spring boot course","Creating rest api using spring boot "));
    }
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == course.getId()) {
//                list.set(i, course); // Update the course in the list
//                return course;
//
//            }
//        }
//        return null;
//        Course entity = courseDao.getOne(course.getId());
//        entity.setId(course.getId());
//        entity.setTitle(course.getTitle());
//        entity.setDescription(course.getDescription());
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(long courseId) {
        Course entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
    }
}

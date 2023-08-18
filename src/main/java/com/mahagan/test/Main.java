package com.mahagan.test;

import com.mahagan.dao.ProjectDao;
import com.mahagan.domain.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDao projectDao = applicationContext.getBean("projectDao", ProjectDao.class);
        Project project = new Project();
        project.setProjectNo(4);
        project.setTitle("Hospital Management System");
        project.setDescription("DEF");
        project.setDuration(65);
        project.setStatus("test 3");
        System.out.println(projectDao.insertprojects(project));

    }
}
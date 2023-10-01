package org1.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        //Using xml file
//            ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        //Using config file
          ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);

//        Doctor doctor=context.getBean(Doctor.class);
//        doctor.Assist();
//        Nurse nurse=(Nurse) context.getBean(("Nurse"));
//        nurse.Assisting();

        //Using Interface
//        Staff s=context.getBean(Doctor.class);
//        s.assist();

        //Injecting properties via setters from xml file (through setter injection and constructor injection)
//        Staff staff=context.getBean(Doctor.class);
//        System.out.println(doctor.getQualification());
//        staff.assist();
//        Staff s=context.getBean(Nurse.class);
//        s.assist();

        Doctor doctor=context.getBean(Doctor.class);
        doctor.setQualification("MBBS");
        System.out.println(doctor);
        doctor.assist();

        Doctor doctor1=context.getBean((Doctor.class));
        System.out.println(doctor1);
    }
}
package org1.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff , BeanNameAware {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;
    //Constructor function of class Doctor
//    public Doctor(String qualification){
//        this.qualification=qualification;
//    }
    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

//    Aware Annotation
    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Name Method Is Called");
    }
//    Post construct Annotation
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct method is called");
    }
}

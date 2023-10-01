package org1.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org1.example")
public class BeanConfig {
//     @Bean
//    public Doctor doctor(){
//         return new Doctor();
//     }
     @Bean
    public Nurse nurse(){
         return new Nurse();
    }
}

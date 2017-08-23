package com.mkyong.common;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.common.EmailService;
 
public class SpringDemo {
 
    public static void main(String a[]){
 
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context 
                        = new ClassPathXmlApplicationContext(confFile);
        EmailService emailService = (EmailService) context.getBean("emailService");
        String toAddr = "java2novice@gmail.com";
        String fromAddr = "javauser@gmail.com";
        String subject = "My Test Mail";
        String body = "Test mail body";
        emailService.sendEmail(toAddr, fromAddr, subject, body);
    }
}
package com.collaboration.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.collaboration.configuration.ApplicationContextConfig;

public class App {
	
public static void main( String[] args )
    {
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
           
}

}

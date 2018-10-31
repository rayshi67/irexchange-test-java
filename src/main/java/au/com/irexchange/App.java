package au.com.irexchange;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import au.com.irexchange.service.CountService;

public class App {
	
    public static void main(String[] args) {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	 
        CountService countService = (CountService) context.getBean("countService");
        
        countService.initialize();
        
        countService.process();

        countService.report();
    }

}

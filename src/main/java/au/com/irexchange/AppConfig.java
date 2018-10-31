package au.com.irexchange;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import au.com.irexchange.service.CountService;
import au.com.irexchange.service.CountServiceConfig;
import au.com.irexchange.service.impl.CountServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="countService")
    public CountService countService() {
        return new CountServiceImpl();
    }
	
	@Bean(name="countServiceConfig")
    public CountServiceConfig countServiceConfig() {
        return new CountServiceConfig();
    }

}

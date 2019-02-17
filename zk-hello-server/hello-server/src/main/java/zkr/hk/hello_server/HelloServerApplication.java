package zkr.hk.hello_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@EnableEurekaClient
@RestController
public class HelloServerApplication {
	public static void main(String[] agrs) {
		SpringApplication.run(HelloServerApplication.class, agrs);
	}
	
	 @Value("${server.port}")
	    String port;
	 
	 
	    @RequestMapping("/")
	    public String home() {
	        return "hello world from port " + port;  }
	    
	    @RequestMapping("/hello")
	    public String hello() {
	        return "hello world from hello port " + port;  }
	
}

package springcloud.test.eureka.eurekaDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloud.test.eureka.eurekaDemo.server.HelloService;

@RestController
public class HelloController {
	    
	    @Autowired
	    HelloService helloService;
		
	    @RequestMapping("/hello")
		public String getHelloContent() {
			return helloService.hello();
		 }
}


package zkr.hk.Hystrix.server;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceFailure implements HelloService {

	@Override
	public String hello() {
		 System.out.println("hello world service is not available !");
		 return "hello world service is not available !";
	}
     
}
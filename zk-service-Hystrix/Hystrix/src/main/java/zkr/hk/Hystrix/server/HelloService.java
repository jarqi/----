package zkr.hk.Hystrix.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Service
@FeignClient(name = "HELLO-SERVER", fallback = HelloWorldServiceFailure.class)
public interface  HelloService {
	 @RequestMapping(value = "/hello",method = RequestMethod.GET)
	 String hello();
}


package zkr.hk.feign_server.server;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(value = "HELLO-SERVER")
public interface  HelloService {
	 @RequestMapping(value = "/hello",method = RequestMethod.GET)
	 String hello();
}

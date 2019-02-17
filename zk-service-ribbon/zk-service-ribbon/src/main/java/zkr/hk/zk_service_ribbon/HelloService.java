package zkr.hk.zk_service_ribbon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloService {
	@Autowired
    RestTemplate restTemplate;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return restTemplate.getForObject("http://HELLO-SERVER/",String.class);
	}
	
	
	
	@RequestMapping(value="/haha",method=RequestMethod.GET)
	public String getHelloContent() {
		return restTemplate.getForObject("http://HELLO-SERVER/",String.class);
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVER/hello", String.class).getBody();
    }
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String hi() {
		return "hihihi";
	}
	
	
}

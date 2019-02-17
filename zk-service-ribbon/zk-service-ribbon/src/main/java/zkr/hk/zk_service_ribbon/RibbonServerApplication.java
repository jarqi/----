package zkr.hk.zk_service_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient

public class RibbonServerApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(RibbonServerApplication.class, args);
    }
     
    
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
    	return new RestTemplate();
    }
    
  
}

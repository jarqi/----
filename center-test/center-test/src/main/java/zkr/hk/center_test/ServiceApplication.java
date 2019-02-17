package zkr.hk.center_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ServiceApplication.class, args);
    }
}

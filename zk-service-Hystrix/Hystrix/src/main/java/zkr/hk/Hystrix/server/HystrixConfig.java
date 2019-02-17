package zkr.hk.Hystrix.server;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@Configuration
public class HystrixConfig {
	 @Bean
	public HystrixMetricsStreamServlet hystrixMetricsStreamServlet(){
		return new HystrixMetricsStreamServlet();
	}
	
	 @Bean
	public ServletRegistrationBean registration(HystrixMetricsStreamServlet servlet){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean();
		registrationBean.setServlet(servlet);
		//是否启用该registrationBean
		 registrationBean.setEnabled(true);
		 registrationBean.addUrlMappings("/hystrix.stream");
		 return registrationBean;
	}
}

package com.v8en.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(Sink.class)
public class MQApplication {

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MQApplication.class, args);
	}
	
	@Component
	class StartupRunner implements CommandLineRunner {

		@Autowired
		private SendingBean sendingBean;
		
		@Override
		public void run(String... arg0) throws Exception {
			System.out.println("Start sender");
			sendingBean.timerMessageSource();
		}
		
	}
}

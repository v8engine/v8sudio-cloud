/**
 * 版权所有 v8en.com
 * 
 * 作者： Simon
 */
package com.v8en.cloud;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;

/**
 * @author Simon
 * web-site : www.v8en.com
 *
 */
@EnableBinding(Sink.class)
public class KafkaReceiver {  
  
	@StreamListener(Sink.INPUT)
	 public void process(Message<?> message) {
	     Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
	     if (acknowledgment != null) {
	         System.out.println("Acknowledgment provided");
	         acknowledgment.acknowledge();
	     }
	 }
      
}  

/**
 * 版权所有 v8en.com
 * 
 * 作者： Simon
 */
package com.v8en.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Simon
 * web-site : www.v8en.com
 *
 */
@EnableBinding(Source.class)
public class SendingBean {

    @InboundChannelAdapter(value = Source.OUTPUT)
    public String timerMessageSource() {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println();
        return format;
    }

    public static void main(String[] args) {

    }

}
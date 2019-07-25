package guru.springframework.sfgjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

/**
 * Created by Donald F. Coffin on 07/25/2019 at 16:24
 */
@Configuration
public class JmsConfig {

    public static final String MY_QUEUE = "my-hello-world";
    public static final String MY_SEND_RCV_QUEUE = "replybacktome";

    @Bean
    public MessageConverter messageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
}

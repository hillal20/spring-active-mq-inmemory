package springJmsMessaging.springJmsMessaging.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerController {

    @JmsListener(destination = "myQueue")
    public void listen(String message){
        System.out.println("receiving =====> "+ message);
    }
}

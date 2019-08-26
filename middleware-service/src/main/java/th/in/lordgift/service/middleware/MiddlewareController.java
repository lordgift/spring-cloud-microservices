package th.in.lordgift.service.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
public class MiddlewareController {

    @Value("${message}")
    private String message;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/")
    public MessageObject getHelloWorld() {

        List<ServiceInstance> instances = discoveryClient.getInstances("AUTH-SERVICE");
//        instances.get(0).getUri()

        return new MessageObject("Hello, World!");
    }

    @GetMapping("/msg")
    public String getMessage() {
        return message;
    }


}
package th.in.lordgift.service.middleware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiddlewareController {

    @Value("${message}")
    private String message;

//    @Autowired
//    DiscoveryClient discoveryClient;

    @GetMapping("/")
    public MessageObject getHelloWorld() {

//        List<ServiceInstance> instances = discoveryClient.getInstances("app-service");
//        instances.get(0).getUri()

        return new MessageObject("Hello, World!");
    }

    @GetMapping("/msg")
    public String getMessage() {
        return message;
    }


}
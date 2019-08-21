package th.in.lordgift.service.middleware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MiddlewareController {

    @Value("${message}")
    private String message;

    @GetMapping("/")
    public MessageObject getHelloWorld() {
        MessageObject hello = new MessageObject();
        hello.setMessage("Hello, World!" + message);
        return hello;
    }
}
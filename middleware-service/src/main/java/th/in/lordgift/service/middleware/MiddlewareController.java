package th.in.lordgift.service.middleware;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MiddlewareController {

    @GetMapping("/")
    public MessageObject getHelloWorld() {
        MessageObject hello = new MessageObject();
        hello.setMessage("Hello, World!");
        return hello;
    }
}
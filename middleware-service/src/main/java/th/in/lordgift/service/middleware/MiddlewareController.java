package th.in.lordgift.service.middleware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("middle")
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
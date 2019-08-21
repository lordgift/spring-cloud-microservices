package th.in.lordgift.service.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/authen")
    public String getMessage() {
        return "Authen success!";
    }

}
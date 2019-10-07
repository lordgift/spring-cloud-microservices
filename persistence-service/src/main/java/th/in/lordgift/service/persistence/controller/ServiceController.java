package th.in.lordgift.service.persistence.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.in.lordgift.service.persistence.model.entity.MyUser;
import th.in.lordgift.service.persistence.service.ServiceManager;

@RestController
@RequestMapping("/api")
public class ServiceController {

    private static final Logger log = LogManager.getLogger(ServiceController.class);

    @Autowired
    ServiceManager serviceManager;

    @GetMapping("/")
    public String getHelloWorld() {
        return "I'm Mobile API.";
    }

    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(serviceManager.queryMyUser());
    }

    @PostMapping(path = "/user", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity addUser(@RequestBody MyUser user) {
        try {
            log.debug("hello debug");
            return ResponseEntity.ok(serviceManager.addMyUser(user));
        } catch (Exception e) {
            log.error("error add user", e);
            return ResponseEntity.badRequest().build();
        }
    }
}

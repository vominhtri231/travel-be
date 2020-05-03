package travel.be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import travel.be.entity.Greeting;
import travel.be.service.GreetingService;

@RestController
@RequestMapping("hello")
public class HelloController {

    private final GreetingService service;

    public HelloController(GreetingService service) {
        this.service = service;
    }

    @GetMapping
    public Greeting getHello() {
        return service.getMessage(1L);
    }
}

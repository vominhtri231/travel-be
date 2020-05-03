package travel.be.service;

import org.springframework.stereotype.Service;
import travel.be.entity.Greeting;
import travel.be.repository.GreetingRepository;

@Service
public class GreetingService {
    private final GreetingRepository repository;

    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public Greeting getMessage(Long id) {
        return repository.findById(id).orElseGet(Greeting::new);
    }
}

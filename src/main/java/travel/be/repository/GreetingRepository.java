package travel.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import travel.be.entity.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}

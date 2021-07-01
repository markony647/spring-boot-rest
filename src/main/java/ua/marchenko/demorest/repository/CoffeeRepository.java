package ua.marchenko.demorest.repository;

import org.springframework.data.repository.CrudRepository;
import ua.marchenko.demorest.domain.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}

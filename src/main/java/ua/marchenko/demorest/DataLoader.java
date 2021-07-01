package ua.marchenko.demorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.marchenko.demorest.domain.Coffee;
import ua.marchenko.demorest.repository.CoffeeRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataLoader {

    private CoffeeRepository coffeeRepository;

    @Autowired
    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData() {
        coffeeRepository.saveAll(List.of(
                new Coffee("Café Cereza"),
                new Coffee("Café Ganador"),
                new Coffee("Café Lareño"),
                new Coffee("Café Três Pontas")
        ));
    }
}

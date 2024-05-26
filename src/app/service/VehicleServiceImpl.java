package app.service;

import app.domain.Vehicle;
import app.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class VehicleServiceImpl implements VehicleService {

    // Три способа внедрения зависимости при помощи Spring
    // 1. Аннотация @Autowired на поле класса
    // 2. Внедрение через конструктор
    // 3. Внедрение через сеттер

    private final VehicleRepository repository;


    private final String articlePrefix;

    public VehicleServiceImpl(
            VehicleRepository repository,
            @Value("${article.prefix}") String articlePrefix
    ) {
        this.repository = repository;
        this.articlePrefix = articlePrefix;
    }

    @Override
    public Vehicle getById(Long id) {
        Vehicle vehicle = repository.getById(id);
        setArticle(vehicle);
        return vehicle;
    }

    private void setArticle(Vehicle vehicle) {
        // Banana, id=2 -> Art-B-2
        String article = String.format("%s-%s-%d",
                articlePrefix, vehicle.getCarMake().charAt(0), vehicle.getId());
        vehicle.setArticle(article);
    }

}
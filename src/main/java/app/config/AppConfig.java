package app.config;

import app.model.Cat;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean("dog")
    public Dog getDog() {
        return new Dog();;
    }

    @Bean("cat")
    public Cat getCat() {
        return new Cat();
    }

}
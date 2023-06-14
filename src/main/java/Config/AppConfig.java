package Config;

import Transport.Bus;
import Transport.Car;
import Driver.Driver;
import Transport.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBean() {
        return new Car("Lada");
    }

    @Bean
    public Bus getBusBean() {
        return new Bus("LIAZ");
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup("UAZ");
    }

    @Bean(name = "driver1")
    public Driver getDriver1Bean() {
        return new Driver( getCarBean());
    }
    @Bean(name = "driver2")
    public Driver getDriver2Bean() {
        return new Driver( getBusBean());
    }
    @Bean(name = "driver3")
    public Driver getDriver3Bean() {
        return new Driver( getPickupBean());
    }

}

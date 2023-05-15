import Config.AppConfig;
import Driver.Driver;
import Transport.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!!!");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

       Driver driver1 = context.getBean("driver1", Driver.class);
       Driver driver2 = context.getBean("driver2", Driver.class);
       Driver driver3 = context.getBean("driver3", Driver.class);

       driver1.getTransport().transportReady();
       driver2.getTransport().transportReady();
       driver3.getTransport().transportReady();
    }
}

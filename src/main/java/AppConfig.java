import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {

    @Bean(name="BeanHelloWorld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name="BeanCat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setCatMessage("Mur-mur");
        return cat;
    }

}
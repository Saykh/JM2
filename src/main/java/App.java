import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("BeanHelloWorld");
        System.out.println(bean.getMessage());

        HelloWorld beanTwoHelloWorld =
                (HelloWorld) applicationContext.getBean("BeanHelloWorld");
        System.out.println(beanTwoHelloWorld.getMessage());

        System.out.println();

        Cat beanOneCat =
                (Cat) applicationContext.getBean("BeanCat");
        System.out.println(beanOneCat.getCatMessage());

        Cat beanTwoCat =
                (Cat) applicationContext.getBean("BeanCat");


        System.out.println();

        System.out.println(bean == beanTwoHelloWorld);
        System.out.println(beanOneCat == beanTwoCat);

    }
}
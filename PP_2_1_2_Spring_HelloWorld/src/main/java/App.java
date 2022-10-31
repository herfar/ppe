import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat meow = (Cat) applicationContext.getBean("cat");
        Cat cat = (Cat) applicationContext.getBean("cat");
        boolean compare = bean == bean1;
        System.out.println(compare);
        System.out.println("-----");
        boolean compare1 = cat == meow;
        System.out.println(compare1);
    }
}
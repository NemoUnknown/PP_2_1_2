import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("matroskin");
        System.out.println(beanCat);
        HelloWorld anotherBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanAnotherCat = (Cat) applicationContext.getBean("matroskin");
        System.out.println((bean == anotherBean) + ", " + (beanCat == beanAnotherCat));

    }
}
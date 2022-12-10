import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        ApplicationContext cat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat catBean = (Cat) cat.getBean("cat");
        System.out.println(catBean.getMessage());

        Cat catBean1 = (Cat) cat.getBean("cat");
        System.out.println(catBean1.getMessage());

        System.out.println(bean == bean1); // true
        System.out.println(catBean == catBean1); // false
    }
}
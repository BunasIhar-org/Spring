package koschei;

import koschei.config.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        KoscheiTheDeathless koscheiTheDeathless = applicationContext.getBean(KoscheiTheDeathless.class);

        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
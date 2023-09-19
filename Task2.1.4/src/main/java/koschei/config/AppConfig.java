package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
}
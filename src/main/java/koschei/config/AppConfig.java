package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean static Egg6 getIsEgg(Needle7 needle) {
        return new Egg6(needle);
    }

    @Bean static Needle7 getIsNeedle() {
        return new Needle7();
    }

}

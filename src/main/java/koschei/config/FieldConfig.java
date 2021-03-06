package koschei.config;

import koschei.models.Duck5;
import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class FieldConfig {

    @Bean
    public static Duck5 getDuck(Egg6 egg) {
        return new Duck5(egg);
    }
}

package me.springframework.context.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * @author Administrator
 * @description 默认的profile配置,如果未指定使用那个profile,则默认的配置会被启用
 * @date 2017/5/14
 */
@Configuration
@Profile("default")
public class DefaultDataConfig {
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:sql/schema.sql")
                .build();
    }
}

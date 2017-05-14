package me.springframework.context.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * @author Administrator
 * @description
 * @date 2017/5/14
 */
@Configuration
@Profile("development")
@PropertySource({"classpath:profile/common.properties","classpath:profile/development.properties"})
public class StandaloneDataConfig {

    @Autowired
    Environment env;

    @Bean
    public DataSource dataSource() {
        System.out.println(env.getProperty("spring.common"));
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:sql/schema.sql")
//                .addScript("classpath:sql/test-data.sql")
                .build();
    }
}

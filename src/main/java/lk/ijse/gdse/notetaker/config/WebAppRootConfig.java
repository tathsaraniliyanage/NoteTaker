package lk.ijse.gdse.notetaker.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Prabodha Thathsarani
 * @date 10/1/24
 * @project notetaker
**/

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.notetaker")
@EnableJpaRepositories(basePackages = "lk.ijse.gdse.notetaker")
@EnableTransactionManagement
public class WebAppRootConfig {
    @Bean
    public modelMapper modelMapper(){
        return new modelMapper();
    }


}

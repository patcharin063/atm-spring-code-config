package th;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {

    @Bean
    public DataSource dataSource(){
        return new DataSourceFile("customers.txt");
    }

    @Bean
    public Bank bank(){
        return  new Bank("My Bank",dataSource());

    }

    @Bean ATM atm(){
        return new ATM(bank());
    }

    @Bean AtmUI atmUI(){
        return new AtmUI(atm());
    }



}

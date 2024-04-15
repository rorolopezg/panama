package tech.kopernicus.data.specification.example.dataspecexample.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "tech.kopernicus.data.specification.example.dataspecexample.repositories.oracle",
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager"
)

//@EnableConfigurationProperties
public class DataSourceConfigOracle {
    @Bean(name="oracleProperties")
    @ConfigurationProperties("spring.third-datasource")
    public DataSourceProperties dataSourceProperties() {

        return new DataSourceProperties();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.third-datasource")
    public DataSource oracleDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name="oracleDataSource")
    @ConfigurationProperties(prefix = "spring.third-datasource")
    public DataSource datasource(@Qualifier("oracleProperties") DataSourceProperties properties){

        return properties.initializeDataSourceBuilder().build();
    }

    @Bean(name="oracleEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
            (EntityManagerFactoryBuilder builder,
             @Qualifier("oracleDataSource") DataSource dataSource){

        LocalContainerEntityManagerFactoryBean em = builder.dataSource(dataSource)
                .packages("tech.kopernicus.data.specification.example.dataspecexample.model.entities.oracle")
                .persistenceUnit("oraclePU")
                .build();
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean(name = "oracleTransactionManager")
    @ConfigurationProperties("spring.oracle.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("oracleEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }

}

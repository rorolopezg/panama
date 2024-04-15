package tech.kopernicus.data.specification.example.dataspecexample.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "cursosEntityManagerFactory",
        transactionManagerRef = "cursosTransactionManager",
        basePackages = { "tech.kopernicus.data.specification.example.dataspecexample.repositories.cursos" })
public class CursosDatasourceConfiguration {

    @Bean(name="cursosProperties")
    @ConfigurationProperties("spring.second-datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name="cursosDatasource")
    @ConfigurationProperties(prefix = "spring.second-datasource")
    public DataSource datasource(@Qualifier("cursosProperties") DataSourceProperties properties){
        return properties.initializeDataSourceBuilder().build();
    }

    @Bean(name="cursosEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,  @Qualifier("cursosDatasource") DataSource dataSource){
        LocalContainerEntityManagerFactoryBean em = builder.dataSource(dataSource)
        .packages("tech.kopernicus.data.specification.example.dataspecexample.model.entities.cursos")
        .persistenceUnit("cursos").build();
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgresPlusDialect");
        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean(name = "cursosTransactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("cursosEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }
}
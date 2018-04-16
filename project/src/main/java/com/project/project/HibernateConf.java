package com.project.project;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@Configuration
//@ComponentScan("com.project.*")
//@EnableWebMvc
//@EnableTransactionManagement
//@PropertySource("classpath:application.properties")
public class HibernateConf {//extends WebMvcConfigurerAdapter {
 
   /* @Autowired
    private Environment env;
 
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
 
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
 
        return dataSource;
    }
 
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan(env.getProperty("com.project.*"));
        sessionFactoryBean.setHibernateProperties(hibProperties());
        return sessionFactoryBean;
    }
 
    private Properties hibProperties() {
        Properties properties = new Properties();
        properties.put("spring.jpa.database-platform", env.getProperty("spring.jpa.database-platform"));
        properties.put("spring.jpa.hibernate.ddl-auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
        properties.put("spring.jpa.show-sql", env.getProperty("spring.jpa.show-sql"));
        return properties;
    }
 
    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }
 
 /*   @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }*/
}
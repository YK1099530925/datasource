package datasuorcetwo.datasource.dataSourceConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryBeanLocal",
        transactionManagerRef = "transactionManagerLocal",
        basePackages = {"datasuorcetwo.datasource.repositoryLocal"} // 设置Repository所在的位置
)
public class LocalConfig {
    @Resource
    @Qualifier("localDataSource")
    private DataSource localDataSource;

    @Primary
    @Bean(name = "entityManagerFactoryBeanLocal")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBeanLocal(){
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(localDataSource);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("datasuorcetwo.datasource.entity");
        factoryBean.setJpaProperties(hibernateProperties());

        return factoryBean;
    }

    public Properties hibernateProperties(){
        final Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        return hibernateProperties;
    }

    @Primary
    @Bean(name = "transactionManagerLocal")
    public PlatformTransactionManager transactionManagerLocal(){
        return new JpaTransactionManager(entityManagerFactoryBeanLocal().getObject());
    }
}

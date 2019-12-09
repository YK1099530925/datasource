package datasuorcetwo.datasource.dataSourceConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 创建数据源的java文件，告诉程序要用到两个数据源，于是程序就去连接这两个数据库
 * 怎么连接呢？默认的连接已经行不通了，因此对于每个数据库还需要有一个定义文件告诉程序如何去连接他
 * 同样在该包下新建两个数据库定义文件，分别定义生产和本地数据库
 * 注：生产数据库即源数据库，本地数据库即目标数据库。到时候可以自己转换到对应数据库
 */
@Configuration
public class DataSourceConfig {
    @Bean(name = "productDataSource")
    @Qualifier("productDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.product")
    public DataSource productDataSource(){
        System.out.println("源数据库");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "localDataSource")
    @Qualifier("localDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.local")
    public DataSource localDataSource(){
        System.out.println("目标数据库");
        return DataSourceBuilder.create().build();
    }
}

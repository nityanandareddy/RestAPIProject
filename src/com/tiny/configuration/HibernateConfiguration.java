package com.tiny.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.tiny.configuration" })
@PropertySource(value = { "classpath:application.properties" })
public class HibernateConfiguration 
{

}

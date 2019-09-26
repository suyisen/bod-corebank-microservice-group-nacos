package org.suyisen.bod.corebank.microservice.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
@EnableAutoConfiguration
@ComponentScan(basePackages= {"org.suyisen"})
public class BodCoreBankMicroServiceNacosDiscoveryApp {
	
//	@NacosInjected
//    private NamingService namingService;
//
//    @Value("${server.port}")
//    private int serverPort;
//
//    @Value("${spring.application.name}")
//    private String applicationName;
//
//    @PostConstruct
//    public void registerInstance() throws NacosException {
//        namingService.registerInstance(applicationName, "127.0.0.1", serverPort);
//    }

    public static void main(String[] args) {
        SpringApplication.run(BodCoreBankMicroServiceNacosDiscoveryApp.class, args);
    }

}

package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 孙志贤 曾东东
 * @title: Productionapp
 * @projectName erp-production
 * @description: 生产模块
 * @date 2020-04-17
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.ddossec.mapper"})
public class Productionapp {
    public static void main(String[] args) {
        SpringApplication.run(Productionapp.class, args);
    }
}
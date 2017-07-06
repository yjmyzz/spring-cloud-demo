package com.cnblogs.yjmyzz.spring.cloud.study.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by yangjunming on 2017/7/5.
 */
@Component
@Data
@ConfigurationProperties(prefix = "demo")
public class DemoConfig {

    private String title;
}

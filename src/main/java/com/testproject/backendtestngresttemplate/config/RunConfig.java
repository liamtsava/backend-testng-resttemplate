package com.testproject.backendtestngresttemplate.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class RunConfig {

    @Value("${port}")
    private Integer port;
}

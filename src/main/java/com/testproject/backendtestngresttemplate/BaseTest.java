package com.testproject.backendtestngresttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.testproject.backendtestngresttemplate.config.RunConfig;

@SpringBootTest(classes = RunConfig.class)
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private RunConfig runConfig;

    @Autowired
    private Environment environment;

    @Test
    public void test() {
        System.out.println("wow " + runConfig.getPort() + " " + environment.getActiveProfiles()[0]);
    }
}

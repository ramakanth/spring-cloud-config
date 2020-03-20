package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeController {
	@Value("${app.service.name}")
    private String serviceName;

    @Value("${app.shared.attribute}")
    private String sharedAttribute;


    @GetMapping("/service")
    public String getServiceName() {
        return "service name [" + this.serviceName + "]";
    }
    @GetMapping("/greeting")
    public String greeting() {
        return "Wish you happy birth day";
    }


    @GetMapping("/shared")
    public String getSharedAttribute() {
        return " application.properties [" + this.sharedAttribute + "]";
    }
}

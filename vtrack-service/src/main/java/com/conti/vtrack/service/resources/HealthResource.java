package com.conti.vtrack.service.resources;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthResource {
    
    @GetMapping("/health")
    public HashMap<String, String> sayHello() {
        
        var map = new HashMap<String, String>();
 
        map.put("service", "VTrack-Service");
        map.put("status", "Up and running");
 
        return map;
    }
}
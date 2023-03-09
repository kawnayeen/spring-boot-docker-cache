package com.kawnayeen.dockercache;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
  @GetMapping("/health")
  public String healthPoint() {
    return "OK - docker cache in github action with bootJar";
  }
}

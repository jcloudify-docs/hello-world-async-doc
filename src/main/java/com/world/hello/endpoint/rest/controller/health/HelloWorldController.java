package com.world.hello.endpoint.rest.controller.health;

import com.world.hello.service.HelloWorldService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloWorldController {
  private final HelloWorldService service;

  @GetMapping("/hello-world")
  public String helloWorldWithAsyncEmail(@RequestParam String to) {
    return service.sendHelloWorldWithAsyncEmail(to);
  }
}

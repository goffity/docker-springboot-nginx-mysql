package com.goffity.demo.docker.dockerspringbootnginx.controllers;

import com.goffity.demo.docker.dockerspringbootnginx.model.HomeResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final Log logging = LogFactory.getLog(HomeController.class.getSimpleName());

    @GetMapping(value = "/")
    public HomeResponse getHome() {
        logging.info("getHome()");
        return new HomeResponse(200, "OK", "OK", "OK", "OK");
    }
}

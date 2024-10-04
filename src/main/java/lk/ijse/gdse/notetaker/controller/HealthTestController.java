package lk.ijse.gdse.notetaker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prabodha Thathsarani
 * @date 10/4/24
 * @project notetaker
 **/

@RestController
@RequestMapping("api/v1/health")
public class HealthTestController {
    @GetMapping
    public String healthTest(){
        return "note controller app run successfully";
    }
}

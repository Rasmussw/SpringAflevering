package com.example.springaflevering.controllers;
import com.example.springaflevering.services.DayOfWeekCalculator;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;


@RestController
public class IndexController {

    @GetMapping("/hello")
    public String helloWold(){
        return "Hello Wold";
    }

    @GetMapping("/echo")
    public String inputString(@RequestParam String input){
        return input;
    }

    @GetMapping("/erdetfredag")
    public String erDetFredag(){

        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();

        if (dayOfWeek == 5){
            return "er det fredag? JA DET ER FREDAG🍻";
        }else {
            return "er det fredag? nej det er ikke fredag☹️";
        }
    }


    @GetMapping("/fredag")
    public String fredag(){

        if (DayOfWeekCalculator.getDayOfWeek() == 1){
            return "er det fredag? JA DET ER FREDAG🍻";
        }else {
            return "er det fredag? nej det er ikke fredag☹️";
        }
    }
}
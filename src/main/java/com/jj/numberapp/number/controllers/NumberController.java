package com.jj.numberapp.number.controllers;

import com.jj.numberapp.number.services.NumberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    @RequestMapping(value = "/bubblesort", method = RequestMethod.GET)
    public @ResponseBody
    void getBubbleSort() {
        NumberService.getBubbleSort();
    }
}

package com.visa.training.web.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    
    @RequestMapping(value="/calculator")
    public ModelAndView performCalculation(@RequestParam("n1")double n1,@RequestParam("n2")double n2,@RequestParam("op")String op) {
        double result = 0;
        switch(op) {
        case "+":
            result = n1+n2;
            break;
        case "-":
            result = n1-n2;
            break;
        
        case "*":
            result = n1*n2;
            break;
        
        case "/":
            result = n1/n2;
            break;
        
        }
        
        Map<String,Object> model = new HashMap<String, Object>();
        model.put("result", result);
        return new ModelAndView("calculatorview", model);
    }

}

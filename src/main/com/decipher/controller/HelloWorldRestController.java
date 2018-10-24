package com.decipher.controller;

import com.decipher.request.CalculatorRequest;
import com.decipher.response.CalculatorResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Suraj Pratap Singh
 */
@RestController
@RequestMapping("/calculator")
public class HelloWorldRestController {
    /**
     * @param calculatorRequest : take values to be operation performed
     * @return : gives result of the operation
     */
      @PostMapping(value = "/add", produces = "application/json")
        public CalculatorResponse calculatorAddition( CalculatorRequest calculatorRequest) {
        CalculatorResponse calculatorResponse = new CalculatorResponse ();
        calculatorResponse.setResult ( calculatorRequest.getVar1 () + calculatorRequest.getVar2 () );
        return calculatorResponse;
    }

    /**
     * @param request : take values to be operation performed
     * @return : gives result of the operation
     */
    @RequestMapping(value = "/sub", produces = "application/json")
    public CalculatorResponse calculatorSubtraction(@ModelAttribute CalculatorRequest request) {
        CalculatorResponse response = new CalculatorResponse ();
        response.setResult ( request.getVar1 () - request.getVar2 () );
        return response;
    }

    /**
     * @param request : take values to be operation performed
     * @return : gives result of the operation
     */
    @RequestMapping(value = "/mul", produces = "application/json")
    public CalculatorResponse calculatorMultiplication(@ModelAttribute CalculatorRequest request) {
        CalculatorResponse response = new CalculatorResponse ();
        response.setResult ( request.getVar1 () * request.getVar2 () );
        return (response);
    }

    /**
     * @param request : take values to be operation performed
     * @return : gives result of the operation
     */
    @RequestMapping(value = "/div", produces = "application/json")
    public CalculatorResponse calculatorDivision(@ModelAttribute CalculatorRequest request) {
        CalculatorResponse response = new CalculatorResponse ();
        response.setResult ( request.getVar1 () / request.getVar2 () );
        return response;
    }
}
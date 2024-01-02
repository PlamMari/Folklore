package com.example.Folklore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/test")
public class TestController {

    @GetMapping()
    public ResponseEntity<String> getPlami(@RequestParam String symbol1) {
        //List<Price> prices = Collections.emptyList();
        String response = "hello world" + symbol1;

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

//    @GetMapping()
//    public ResponseEntity<PriceResponse> getPriceForAsset(@RequestParam String symbol1, @RequestParam String symbol2) {
//
//        List<Price> prices = priceService.getAllPrices();
//
//        for(Price price : prices) {
//            if(price.getSymbol().equalsIgnoreCase(symbol1 + symbol2 )) {
//                PriceResponse response = new PriceResponse();
//
//                response.setCode(400);
//                response.setMessage(price.getPrice() + " for " + price.getSymbol());
//                System.out.println("From database");
//
//                return new ResponseEntity<>(response, HttpStatus.OK);
//            }
//        }
//
//        Price price = api.getPriceForTwoAssets(symbol1, symbol2);
//        System.out.println("From api");
//        priceService.addPrice(price);
//
//        PriceResponse response = new PriceResponse();
//
//        response.setCode(200);
//        response.setMessage(price.getPrice() + " for " + price.getSymbol());
//
//
//
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
}

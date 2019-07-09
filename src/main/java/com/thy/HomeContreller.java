package com.thy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by INNGKISAKOL on 28.06.2019.
 */
@RestController
@RequestMapping("/")
public class HomeContreller {

    @RequestMapping(method = GET)
    public ResponseEntity getOrderWithProducts(){
        //We use the restTemplate to call another service; in this case, the product-service.
        //Remember that we are using the spring.application.name we defined for the product in the
        //application.properties of the product microservice.
        System.out.println("ok");
        return null;
    }
}

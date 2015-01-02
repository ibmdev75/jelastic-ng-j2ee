package fr.smabtp.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Karim on 29/12/2014.
 */
@RestController
@RequestMapping("/rest")
public class JelasticController {

        @RequestMapping(value="/{id}", method= RequestMethod.GET)
        public String get(@PathVariable("id") long id) {
            return "ok";
        }
}

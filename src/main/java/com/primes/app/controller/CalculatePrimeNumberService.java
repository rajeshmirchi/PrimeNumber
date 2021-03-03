package com.primes.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatePrimeNumberService {

	/*
	 * @RequestMapping(value = "/primes", method = RequestMethod.GET) public
	 * ResponseEntity<Object> getPrimes() {
	 * 
	 * System.out.println("Hello Primes"); return null; }
	 */

	/*@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		System.out.println("Helol Primes");
		return "Testing";
	}*/
	
	
	@RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

}

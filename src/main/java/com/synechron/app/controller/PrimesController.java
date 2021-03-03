package com.synechron.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.app.service.IPrimesService;
import com.synechron.app.service.PrimesBO;

@RestController
public class PrimesController {
	/**
	 *  This field is used to define primesService
	 */
	@Autowired
	private IPrimesService primesService;

	
	/**
	 * This Method is used to implement the functionality to get the Prime Numbers
	 *
	 * input parameter : initial
	 * return type : PrimesBO
	 */
	@GetMapping(value = "/primes/{initial}", produces = { MediaType.APPLICATION_JSON_VALUE })

	public PrimesBO getPrimes(@PathVariable(name = "initial") int initial) {

		PrimesBO primesBO = null;
		try {

			primesBO = primesService.findPrimes(initial);

		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return primesBO;
	}
}

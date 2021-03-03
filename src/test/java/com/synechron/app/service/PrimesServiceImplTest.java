package com.synechron.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * This Class is used to implement the functionality of Calculating nuber of Prime Number 
 * 
 * @author Rajesh Kurapati
 *
 */
@SpringBootTest
public class PrimesServiceImplTest {
	
	/**
	 *  This field is used to define primesServiceImpl
	 */
	@Autowired
	private IPrimesService primesServiceImpl;
	
	/**
	 * This Method is used to implement the functionality to test findPrimesSuccess Method
	 *
	 * input parameter : 
	 * return type : void
	 */
	@Test
	public void findPrimesSuccessTest() {
		PrimesBO primesBO = primesServiceImpl.findPrimes(10);
		assertEquals(4,primesBO.getPrimesList().size());
	}
	
	/**
	 * This Method is used to implement the functionality to test findPrimesSuccess Method
	 *
	 * input parameter : 
	 * return type : void
	 */
	@Test
	public void findPrimesFailedTest() {
		PrimesBO primesBO = primesServiceImpl.findPrimes(0);
		assertEquals(0,primesBO.getPrimesList().size());
		
	}
	
	/**
	 * This Method is used to implement the functionality to test findPrimesSuccess Method
	 *
	 * input parameter : 
	 * return type : void
	 */
	@Test
	public void findPrimesErrorTest() {
		PrimesBO primesBO = primesServiceImpl.findPrimes(-10);
		assertEquals(0,primesBO.getPrimesList().size());
	}

}

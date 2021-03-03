package com.synechron.app.service;

/**
 * This Interface is used to implement the functionality for Calculating Prime Number 
 * 
 * @author Rajesh Kurapati
 *
 */
public interface IPrimesService {
	/**
	 * This Method is used to implement the functionality to find Prime Numbers
	 *
	 * input parameter : initial
	 * return type : PrimesBO
	 */
	PrimesBO findPrimes(int initial);
}

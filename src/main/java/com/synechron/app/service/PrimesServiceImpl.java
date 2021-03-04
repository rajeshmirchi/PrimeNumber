package com.synechron.app.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * This Class is used to implement the functionality to Calculate Prime Numbers 
 * 
 * @author Rajesh Kurapati
 *
 */
@Service
public class PrimesServiceImpl implements IPrimesService {

	/**
	 *  This field is used to define primesBO
	 */
	@Autowired
	private PrimesBO primesBO;

   	/**
	 * This Method is used to implement the functionality to find Prime Numbers
	 *
	 */
	@Override
	@Cacheable("primesBO")
	public PrimesBO findPrimes(int initial) {
		try {
			primesBO.setInitial(initial);

			System.out.println("Calculating Primes");
			
			List<Integer> primesList = IntStream.rangeClosed(2, initial).filter(n -> isPrime(n))
					.boxed().collect(Collectors.toList());
			

			primesBO.setPrimesList(primesList);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return primesBO;
	}

	/**
	 * This Method is used to implement the functionality to identify a number is prime or not.
	 *
	 * input parameter : int
	 * return type : boolean
	 */
	private static boolean isPrime(int number) {
		
		if(number==2) { 
			
			return true;
		}
		return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number % i == 0);
	}

}

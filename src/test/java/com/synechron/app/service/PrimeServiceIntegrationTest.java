package com.synechron.app.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.jupiter.api.Test;

/**
 * This Class is used to implement the Integration functionality Test of Prime API 
 * 
 * @author Rajesh Kurapati
 *
 */
public class PrimeServiceIntegrationTest {
	
	
	/**
	 * This Method is used to implement the integration functionality of prime API for XML Format
	 *
	 * input parameter : 
	 * return type : void
	 */
	@Test
	public void testGetPrimeNumberXml() {
		String address = "http://localhost:8080/primes/10.xml";
		StringBuffer result = new StringBuffer();
		String expectedResult = "<PrimesBO><initial>10</initial><primesList><primesList>2</primesList><primesList>3</primesList>"
				+ "<primesList>5</primesList><primesList>7</primesList></primesList></PrimesBO>";
		try {

			fetchResult(address, result);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			fail("MalformedURLException caught");
		} catch (IOException e) {
			e.printStackTrace();
			fail("IOException caught");
		}
		assertEquals(expectedResult, result.toString());
	}

	/**
	 * This Method is used to implement the integration functionality of Json format
	 *
	 * input parameter : 
	 * return type : void
	 */
	@Test
	public void testGetPrimeNumberJson() {
		String address = "http://localhost:8080/primes/10.json";
		StringBuffer result = new StringBuffer();
		String expectedResult = "{\"initial\":10,\"primesList\":[2,3,5,7]}";
		try {

			fetchResult(address, result);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			fail("MalformedURLException caught");
		} catch (IOException e) {
			e.printStackTrace();
			fail("IOException caught");
		}
		assertEquals(expectedResult, result.toString());
	}

	/**
	 * This Method is used to implement the functionality to fetch API Result
	 *
	 * input parameter : 
	 * return type : void
	 */
	private void fetchResult(String address, StringBuffer result) throws MalformedURLException, IOException {
		URL url = new URL(address);
		URLConnection conn = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			result.append(inputLine);
		in.close();
	}

}

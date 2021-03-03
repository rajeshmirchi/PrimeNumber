package com.synechron.app.service;

import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.stereotype.Component;


/**
 * This Class is used to hold the value of the calculated Prime numbers
 * 
 * @author Rajesh Kurapati
 *
 */
@Component
public class PrimesBO {
	
	/**
	 *  This field is used to define initial
	 */
	private int initial;
	
	/**
	 *  This field is used to define primesList
	 */
	private List<Integer> primesList;

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public List<Integer> getPrimesList() {
		return primesList;
	}

	public void setPrimesList(List<Integer> primesList) {
		this.primesList = primesList;
	}
	
	
	
	
}
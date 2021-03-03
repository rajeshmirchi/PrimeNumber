package com.synechron.app.service;

import java.util.List;

import javax.annotation.ManagedBean;


/**
 * This Class is used to hold the value of the calculated Prime numbers
 * 
 * @author Rajesh Kurapati
 *
 */
@ManagedBean
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
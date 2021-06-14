package com.oops.java;

public class Bank {

	public static void main(String[] args) {
		ReserveBank rb;
		rb=new ReserveBank();
		System.out.println(rb.getInterest());
		HDFCBank hd=new HDFCBank();
		System.out.println(hd.getInterest());
		
		rb=new BankofBaroda();
		System.out.println(rb.getInterest());
	}

}

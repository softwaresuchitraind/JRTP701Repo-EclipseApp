package com.sukla.payment;

public class UPIPayment 
{
	public String doPayment(long phoneNo,double amount)
	{
		System.out.println("Payment is done.");
		return "PAYMENT-DONE";
	}
}

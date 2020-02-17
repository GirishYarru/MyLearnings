package com.structural.dp.adapter1;

public class IndianSocketAdapter implements UsSocket{
	private IndianSocket indianSocket;
	
	
	public IndianSocketAdapter(IndianSocket indianSocket) {
		this.indianSocket = indianSocket;
	}

	@Override
	public void twoPinchargers() {
		indianSocket.threePinCharger();		
	}

}

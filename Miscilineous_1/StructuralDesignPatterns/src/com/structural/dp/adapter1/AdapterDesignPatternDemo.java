package com.structural.dp.adapter1;

public class AdapterDesignPatternDemo {
	public static void main(String[] args) {
		UsSocket usLenovoCharger = new UsLenovoCharger();
		usLenovoCharger.twoPinchargers();
		
		UsSocket indianLenovoCharger = new IndianSocketAdapter(new IndianLenovoCharger());
		indianLenovoCharger.twoPinchargers();
	}

}

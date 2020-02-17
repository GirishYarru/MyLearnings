package com.dp.singleton;

public class LazyInitialization {
	private static LazyInitialization instance;

	private LazyInitialization() {
	}
	
	private static LazyInitialization getInstance() {

		if(instance ==null)
			return new LazyInitialization();
		else
			return instance;

	
	}
}

package com.arraylist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String packetCreatedDateTime ="20190415122114";
		
		String formattedDate = packetCreatedDateTime.substring(0,8)+"T"+packetCreatedDateTime.substring(packetCreatedDateTime.length()-6);
		
		//String formattedDate = packetCreatedDateTime.substring(0, 8) + "T"+ packetCreatedDateTime.substring(packetCreatedDateTime.length() - 6); 
		LocalDateTime ldt = LocalDateTime.parse(formattedDate, DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss"));
		System.out.println(ldt);
	}

}

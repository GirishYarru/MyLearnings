package com.activemq.sendConsumeMessage;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		BytesMessage byteMessage = (BytesMessage) message;
		byte[] byteData = null;
		try {
			byteData = new byte[(int) byteMessage.getBodyLength()];
			byteMessage.readBytes(byteData);
			byteMessage.reset();
			String stringMessage = new String(byteData);
			System.out.println(">>>>>>>>>>>>>>>>> consumed message :: " + stringMessage);
		} catch (JMSException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

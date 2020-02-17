package com.activemq.sendConsumeMessage;

import javax.jms.BytesMessage;
import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageSender {
	public static void sendMessage() throws JMSException {
		ActiveMQConnectionFactory activeMqConnectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");

		Connection connection = activeMqConnectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

		Destination destination = session.createQueue("learn-activemq-sender");
		MessageProducer producer = session.createProducer(destination);
		producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

		BytesMessage byteMessage = session.createBytesMessage();
		byteMessage.writeObject("girish".getBytes());
		producer.send(byteMessage);

		session.close();
		connection.close();

	}

	public static void main(String[] args) throws JMSException {
		sendMessage();
		System.out.println("Message send successfully");
	}

}

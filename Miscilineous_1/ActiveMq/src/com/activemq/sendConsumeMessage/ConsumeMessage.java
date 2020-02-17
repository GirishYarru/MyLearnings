package com.activemq.sendConsumeMessage;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class ConsumeMessage {
	public static void consumeMessage() throws JMSException {
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");

		Connection connection = activeMQConnectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("learn-activemq-sender");
		MessageConsumer consumer = session.createConsumer(destination);
		consumer.setMessageListener(new MyListener());

	}

	public static void main(String[] args) throws JMSException {
		consumeMessage();
		System.out.println("-------------------------------");

	}

}

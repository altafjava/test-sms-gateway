package com.javaaltaf.test;

import com.javaaltaf.MessageSender;

/**
 * @author Altaf
 *
 */
public class Test {
	public static void main(String[] args) {
		MessageSender messageSender = new MessageSender();
		String message = messageSender.sendSMS("9876543210", "Hello Altaf, How are you?");
		System.out.println("Returned Message = " + message);
	}
}

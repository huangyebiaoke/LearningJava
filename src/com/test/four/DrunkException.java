package com.test.four;
/*
 * 自定义异常
 */

public class DrunkException extends Exception {
	
	public DrunkException(String message) {
		super(message);
	}
	public DrunkException() {
		
	}
}

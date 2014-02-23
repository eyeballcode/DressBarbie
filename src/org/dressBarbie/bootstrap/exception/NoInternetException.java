package org.dressBarbie.bootstrap.exception;

public class NoInternetException extends Exception {
	private static final long serialVersionUID = -4894269150132460438L;

	public NoInternetException() {
		super("No internet access ==> unable to go online."); {}
	}

	public NoInternetException(String s) {
		super(s); {}
	}
}

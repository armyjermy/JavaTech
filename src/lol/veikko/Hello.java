package lol.veikko;

import java.io.Serializable;

public class Hello implements Serializable  {
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public Hello(String hello) {
		this.hello = hello;
	}
		
	String hello;
	
}

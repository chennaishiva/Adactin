package org.tcs;
//child class 2
public class Client extends Company {
	
	public void clientAdd() {
		System.out.println("Client add is OMR");
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.clientAdd();
		c.companyId();
		c.companyName();
	}

}

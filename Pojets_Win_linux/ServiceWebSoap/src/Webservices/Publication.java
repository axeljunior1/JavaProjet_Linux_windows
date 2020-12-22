package Webservices;

import javax.xml.ws.Endpoint;

public class Publication {
	public static void main(String[] args) {
		String url = "http://localhost:8686/";
		Conversion c =new Conversion();
		Endpoint.publish(url, c);
		System.out.println("Adresse: "+ url+"/?wsdl");
	}
}

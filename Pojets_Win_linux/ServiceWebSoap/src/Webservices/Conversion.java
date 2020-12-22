package Webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.fr")
public class Conversion {

	@WebMethod(operationName = "Convertir")
	public double Convertion(@WebParam(name = "mt") double mt) {
		return mt*1.6;
	}
}

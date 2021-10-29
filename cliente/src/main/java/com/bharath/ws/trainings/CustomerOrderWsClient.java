package com.bharath.ws.trainings;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.example.demo.CustomerOrdersWsImplService;

public class CustomerOrderWsClient {

	public static void main(String[] args) throws MalformedURLException {
		
		CustomerOrdersWsImplService service = new CustomerOrdersWsImplService(new URL("http://localhost:8080/wsdlfirstws/customerordersservice?wsdl"));
		CustomerOrdersPortType   customerOrdersWsImplPort  =  service.getCustomerOrdersWsImplPort();
		
		GetOrdersRequest request = new GetOrdersRequest();
		request.setCustomerId(BigInteger.valueOf(1));
		
		GetOrdersResponse response = customerOrdersWsImplPort.getOrders(request);
		List<Order> orders = response.getOrder();
		
		System.out.println("Numero de ordenes: " + " " + orders.size());
		

	}

}

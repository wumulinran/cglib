package com.cdsxt;

import com.cdsxt.factory.ProxyFactory;
import com.cdsxt.service.SuperStar;


public class Client {
	public static void main(String[] args) {
		SuperStar ss=new SuperStar();
		SuperStar s2=(SuperStar)new ProxyFactory(ss).getInstance();
		s2.sing();
	}
	
}

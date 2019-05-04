package com.cdsxt.factory;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory {
	Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public  Object getInstance() {
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
				System.out.println("2222222222");
				Object result = method.invoke(target, arg2);
				System.out.println("2222222");
				return result;
			}
		});
		return enhancer.create();
	}
}

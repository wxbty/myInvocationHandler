package com.xm.MyInvocationHandler;import java.lang.reflect.Method;public class $MyProxy0 implements com.xm.MyInvocationHandler.Man {	MyInvocationHandler handler;	public $MyProxy0(MyInvocationHandler handler) {		this.handler = handler;	}	public void say() throws Throwable {		Method method1 = com.xm.MyInvocationHandler.Man.class.getMethod("say", new Class[]{});		this.handler.invoke(this, method1, null);	}}
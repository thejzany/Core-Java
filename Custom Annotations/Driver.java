package com.jsp.annotations;

public class Driver {
	public static void main(String[] args) {
		UseAnno ua = new UseAnno();
		
		//getClass return type - Class in ObjectClass
		Class c =(Class) ua.getClass();
		//System.out.println(c.getName());
		
		MyAnno myAnno = (MyAnno) c.getAnnotation(MyAnno.class);
		System.out.println(myAnno.id());;
		System.out.println(myAnno.city);
		System.out.println(myAnno.name());
	}
}

package com.jsp.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME) // only activate in runtime
@interface MyAnno { // annotation means get activated only during runtime and not compile time

	// int id is final in nature
	// String name="XYZ";// cannot change as it is final
	// String city="Mumbai";

	// as here variables are taken as methods it can be changed
	// special type of member
	int id() default 10;

	String name() default "XYZ";

	String city = "Mumbai"; // here city is final
}
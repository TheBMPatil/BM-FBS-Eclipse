package com.bm.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {

	public static void main(String[] args) {
		Class meta;
		try {
			meta = Class.forName("java.lang.String");
			Method[] methods = meta.getMethods();
			for (Method m : methods) {
				System.out.println("Method name" + m.getName());
//				System.out.println("parameters : ");
//				Parameter[] params = m.getParameters();
//				for (Parameter p : params) {
//					System.out.println("  " + p.getName() + " " + p.getType());
//				}

			}
			Field[] fields = meta.getFields();
			for (Field f : fields) {
				System.out.println("Variable : " + f.getName() + "   " + f.getType());
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

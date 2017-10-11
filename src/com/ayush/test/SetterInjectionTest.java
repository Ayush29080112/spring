package com.ayush.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ayush.spring.WishMessageGenerator;

public class SetterInjectionTest {
 public static void main(String[] args) {
	//locate spring bean config file
	 Resource res=null;
	 BeanFactory factory=null;
	 res=new FileSystemResource("src/com/ayush/cfg/applicationContext.xml");
	 //create IOC container (Bean factory container)
	 factory=new XmlBeanFactory(res);
	 //instantiate bean
	 WishMessageGenerator generator=(WishMessageGenerator)factory.getBean("wish");
	 System.out.println(generator.wishMessageGenerator("Ayush"));
	
}
}

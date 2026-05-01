//DependencyManagementTest.java (main class/Client app)
package com.nt.main;

import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyMgmtTest {

	public static void main(String[] args) {
		// create  IOC container
		FileSystemXmlApplicationContext  ctx=
				      new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get spring bean class obj ref
		Object obj=ctx.getBean("wmg");
		// type casting
		WishMessageGenerator generator=(WishMessageGenerator) obj;
		//invoke the b.method
		String  msg=generator.generateWishMessage("raja");
		System.out.println(msg);
		System.out.println("-----------------------------------");
		//close the container
		 ctx.close();
	
	}

}

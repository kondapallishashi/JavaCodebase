package com.insync.basics;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptString {

	public static void main(String args[])
	{
		//String encoded=new BCryptPasswordEncoder().encode("admin@123");
	//	int i = 0;
		//while (i < 10) {
			String password = "admin@123";
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			
			String hashedPassword = passwordEncoder.encode(password);

			System.out.println(hashedPassword);
			//i++;
		//}
		
	}
}



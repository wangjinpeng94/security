package com.javaboy.security;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SecurityApplicationTests {

	@Test
	void contextLoads() {
		for (int i=0;i<10;i++) {
			BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
			System.out.println(encoder.encode("123"));
		}
	}

}

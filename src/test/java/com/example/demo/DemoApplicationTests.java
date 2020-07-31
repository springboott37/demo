package com.example.demo;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@TestPropertySource(properties = {"spring.profiles.active=test"})
@ActiveProfiles("test")
class DemoApplicationTests {
	
	
	@Test
	void contextLoads() {
	}

	@Test
	void checkSystemEnvironmentVariable() throws IOException {

		System.setProperty("spring.profiles.active", "test");
		
		System.out.println("************************ "+System.getenv("spring.profiles.active"));
	
	}

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class VersionController {

	private String date;

	private int count;
	
	@Value("${version}")
	private String version;

	@GetMapping("/versionss")
	public String getVersion(){
		return version;
	}

	@GetMapping("/")
	public String home(){
		return "Service is fine";
	}

	public void doSomething()
	{
	}
}

@RestController
class TestController{
	private String a;
	private String b = "fsjddfjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
	@GetMapping("/getb")
	public String getB(){
		return b;
	}
}

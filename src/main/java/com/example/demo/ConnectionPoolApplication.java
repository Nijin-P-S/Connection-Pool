package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionPoolApplication.class, args);

		for(int i=0; i<10; i++){
			Multi t = new Multi();
			t.start();
		}
	}
}

class Multi extends Thread {
	public void run() {
		System.out.println("Thread running: " + Thread.currentThread());
	}
}
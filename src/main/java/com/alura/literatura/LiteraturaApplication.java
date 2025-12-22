package com.alura.literatura;

import com.alura.literatura.main.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	private final Main main;

	@Autowired
    public LiteraturaApplication(Main main) {
        this.main = main;
    }

    public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//	}

	@Override
	public void run(String... args) {
		main.showTheMenu();
	}
}

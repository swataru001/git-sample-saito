package jp.co.rakus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleSaitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitSampleSaitoApplication.class, args);
		
		System.out.println("デプロイとサーバー起動を行います。");
	}
}

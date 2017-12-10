package ch.christianmenz.moccolocotest;

import ch.christianmenz.moccoloco.store.AbstractStore;
import ch.christianmenz.moccoloco.store.MemoryStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@SpringBootApplication
//@EnableAspectJAutoProxy
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan("ch.christianmenz")
public class MoccolocoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoccolocoTestApplication.class, args);
	}

	@Bean
	public AbstractStore getStore() {
		return new MemoryStore("my-memory-store");
	}
}

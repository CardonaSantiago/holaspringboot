package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("hello")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
        @GetMapping("/{firstName}/{lastName}")
        public String sayHello(
                @PathVariable("firstName") String firstName,
                @PathVariable("lastName") String LastName){
            return String.format("<h1>Hello %s %s</h1>", firstName, LastName);
        }
        @GetMapping()
        public String sayHello2(
                @RequestParam("firstName") String firstName,
                @RequestParam("lastName") String LastName){
            return String.format("Hello %s %s", firstName, LastName);
        }
        

}

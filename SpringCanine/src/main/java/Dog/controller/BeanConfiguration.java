package Dog.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Dog.beans.Dog;

@Configuration
public class BeanConfiguration {

	@Bean
	public Dog dog(){
		Dog bean = new Dog();
		bean.setName("Sam");
		bean.setBreed("Boxer");
		bean.setAge(4);
		return bean;
	}
	
	
}

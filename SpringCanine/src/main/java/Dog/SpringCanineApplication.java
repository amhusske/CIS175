package Dog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import Dog.beans.Dog;
import Dog.controller.BeanConfiguration;
import Dog.repository.DogRepository;


@SpringBootApplication
public class SpringCanineApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCanineApplication.class, args);
		
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//perform bean lookup
		//the type argument of dog tells it which type of object to cast the bean to
//		Dog d = appContext.getBean("dog", Dog.class);
//		
//		System.out.println(d.toString());
	}

	
	@Autowired
	DogRepository repo;

	@Override
	public void run(String...args)throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Dog b = appContext.getBean("dog", Dog.class);
		b.setName("Bitsy");
		repo.save(b);
		
		Dog c = new Dog("Sue", "Weiener Dog", 3);
		repo.save(c);
		
		List<Dog>allMyDogs = repo.findAll();
		for(Dog pup: allMyDogs) {
			System.out.println(pup.toString());
		}
		
		//closes the ApplicationCOntext resource leak
		((AbstractApplicationContext) appContext).close();
		}
}

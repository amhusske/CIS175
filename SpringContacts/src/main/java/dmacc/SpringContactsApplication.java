package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;

@SpringBootApplication
public class SpringContactsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringContactsApplication.class, args);
	

	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
	Contact c = appContext.getBean("contact", Contact.class);
	
	System.out.println(c.toString());
	
	}
	
	@Autowired
	ContactRepository repo;

	@Override
	public void run(String...args)throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Contact c = appContext.getBean("contact", Contact.class);
		c.setRelationship("best friend");
		repo.save(c);
		
		Contact d = new Contact("Sandra Boyton", "555-555-5556", "friend");
		Address a = new Address("987 Elm Court", "Altoona", "IA");
		d.setAddress(a);
		repo.save(d);
		
		List<Contact>allMyContacts = repo.findAll();
		for(Contact people: allMyContacts) {
			System.out.println(people.toString());
		}
		
		//closes the ApplicationCOntext resource leak
		((AbstractApplicationContext) appContext).close();
		}
}

package Dog.beans;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Dog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String breed;
	private int age;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
		this.breed = "Golden Retriever";
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog(long id, String name, String breed, int age) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	
	
	public String toString(){
		return "Dog [id = " + id + ", name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
}


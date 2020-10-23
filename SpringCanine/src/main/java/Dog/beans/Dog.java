package Dog.beans;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Dog [id = " + id + ", name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
}


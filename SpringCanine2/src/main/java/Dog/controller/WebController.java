package Dog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import Dog.beans.Dog;
import Dog.repository.DogRepository;

@Controller
public class WebController {

	@Autowired
	DogRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllDogs(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewDog(model);
		}
		model.addAttribute("dogs", repo.findAll());
		return "results";
	}
	
	// GET request mapping = provides new default no args constructor to pass in data to the form
	@GetMapping("/inputDog")
		public String addNewDog(Model model) {
			Dog d = new Dog();
			model.addAttribute("newDog", d);
			return "input";
		}
	
	// POST mapping request = happens after form is submitted
	// Save new dog -> query for updated items in repo -> back into reuslts
	@PostMapping("/inputContact")
		public String addNewDog(@ModelAttribute Dog d, Model model) {
			repo.save(d);
			return viewAllDogs(model);
	}
	
	// Edit
	@GetMapping("/edit/{id}")
	public String showUpdateDog(@PathVariable("id") long id, Model model){
		Dog d = repo.findById(id).orElse(null);
		model.addAttribute("newDog", d);
		return "input";
	}
	
	//Update
	//Grab dog from page and save it - this will add new changes to existing or creat a new one
	@PostMapping("/update/{id}")
	public String updateDog(Dog d, Model model) {
		repo.save(d);
		return viewAllDogs(model);
	}
	
	//DELETE
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Dog d = repo.findById(id).orElse(null);
		repo.delete(d);
		return viewAllDogs(model);
	}
}


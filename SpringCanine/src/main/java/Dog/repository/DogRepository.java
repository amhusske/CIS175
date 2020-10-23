package Dog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Dog.beans.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long>{

	
}

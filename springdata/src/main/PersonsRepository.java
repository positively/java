package main;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonsRepository extends CrudRepository<Person, Long> {
    List<Person> findByName(String name);

    Person findById(long id);
}

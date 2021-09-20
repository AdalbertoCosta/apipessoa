package one.digitalinnovation.apipessoa.repository;


import one.digitalinnovation.apipessoa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement, Long> {

}

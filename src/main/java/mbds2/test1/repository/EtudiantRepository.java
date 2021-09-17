package mbds2.test1.repository;

import org.springframework.data.repository.CrudRepository;

import mbds2.test1.entity.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant, Long>{

}

package br.edu.infnet.applocadora.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocadora.model.domain.Locatario;

@Repository
public interface LocatarioRepository extends CrudRepository<Locatario, Integer> {
	
	@Query("from Locatario l where l.usuario.id = :userid")
	List<Locatario> obterLista(Integer userid);
}
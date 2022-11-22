package br.edu.infnet.applocadora.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocadora.model.domain.Contrato;

@Repository
public interface ContratoRepository extends CrudRepository<Contrato, Integer> {
	
	@Query("from Contrato c where c.usuario.id =:userid")
	List<Contrato> obterLista(Integer userid);
}
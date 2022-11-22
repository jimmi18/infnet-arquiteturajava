package br.edu.infnet.applocadora.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocadora.model.domain.Veiculo;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {
	
	@Query("from Veiculo v where v.usuario.id =:userid")
	List<Veiculo> obterLista(Integer userid);
}
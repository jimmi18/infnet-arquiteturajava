package br.edu.infnet.applocadora.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocadora.model.domain.Aviao;

@Repository
public interface AviaoRepository extends CrudRepository<Aviao, Integer> {

}
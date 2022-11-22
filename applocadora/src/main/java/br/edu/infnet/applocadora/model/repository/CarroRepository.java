package br.edu.infnet.applocadora.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocadora.model.domain.Carro;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {

}
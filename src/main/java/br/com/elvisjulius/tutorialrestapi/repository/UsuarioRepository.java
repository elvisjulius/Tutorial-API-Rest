package br.com.elvisjulius.tutorialrestapi.repository;

import br.com.elvisjulius.tutorialrestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer> {


}

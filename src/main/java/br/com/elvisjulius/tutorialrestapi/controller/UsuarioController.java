package br.com.elvisjulius.tutorialrestapi.controller;

import br.com.elvisjulius.tutorialrestapi.model.UsuarioModel;
import br.com.elvisjulius.tutorialrestapi.repository.UsuarioRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
public class UsuarioController {

    @Autowired
   private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
        .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){return repository.save(usuario);
    }
}

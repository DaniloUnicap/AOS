package primeira.aula.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import primeira.aula.demo.model.Autor;
import primeira.aula.demo.service.AutorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/api/v1/autor/")
@RestController
public class AutorController {
    //Estamos conectando nosso endpoint de Autor aos servoções de Autor
    @Autowired //para injeção de dependências
    public AutorService autorService;

    @PostMapping
    public Autor inserirAutor(@RequestBody Autor autor) {
        return autorService.inserirAutor(autor);
    }

    @GetMapping
    public List<Autor> getTodosAutores() {
        return autorService.retornarTodosAutores();
    }

    @GetMapping
    @RequestMapping("CPF/{CPF}")
    public Autor pegarAutorPeloCPF(@PathVariable String CPF) {
        return autorService.buscarPeloCpf(CPF);
    }
}

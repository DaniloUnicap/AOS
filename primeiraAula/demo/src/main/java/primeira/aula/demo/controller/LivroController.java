package primeira.aula.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import primeira.aula.demo.model.Livro;
import primeira.aula.demo.service.LivroService;

@RequestMapping("/api/v1/livro/")
@RestController
public class LivroController {
    @Autowired
    public LivroService livroService;

    @PostMapping
    public Livro inserirLivro(@RequestBody Livro livro) {
        return livroService.inserirLivro(livro);
    }

    @GetMapping
    public List<Livro> getTodosOsLivros() {
        return livroService.retornarTodosLivros();
    }

    @GetMapping
    @RequestMapping("titulo/{titulo}")
    public Livro pegarPeloTitulo(@PathVariable String titulo) {
        return livroService.buscarPeloTitulo(titulo);
    }
}

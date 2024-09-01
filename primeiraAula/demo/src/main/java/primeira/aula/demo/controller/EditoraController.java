package primeira.aula.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import primeira.aula.demo.model.Editora;
import primeira.aula.demo.service.EditoraService;

@RequestMapping("/api/v1/editora/")
@RestController
public class EditoraController {
    @Autowired
    public EditoraService editoraService;

    @PostMapping
    public Editora inserirEditora(@RequestBody Editora editora) {
        return editoraService.inserirEditora(editora);
    }

    @GetMapping
    public List<Editora> getTodasEditoras() {
        return editoraService.listarTodasEditoras();
    }

    @GetMapping
    @RequestMapping("CNPJ/{CNPJ}")
    public Editora pegarEditoraPeloCNPJ(@PathVariable String CNPJ){
        return editoraService.buscarPeloCnpj(CNPJ);
    }
}

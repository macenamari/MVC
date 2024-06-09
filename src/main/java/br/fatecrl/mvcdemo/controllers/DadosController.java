package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api/livros")
public class DadosController {
    private static final List<Livro>
        livros = new ArrayList<Livro>();

    public DadosController() {
        livros.add(new Livro("Eu morreria por ti e outras histórias", "F. Scott Fitzgerald", "Antofágica", 2017, "Ficção"));
        livros.add(new Livro("Os Miseráveis", "Victor Hugo", "Martin Claret", 1862, "Drama"));
        livros.add(new Livro("Pachinko", "Min Jin Lee", "Intrínseca", 2020, "Drama"));
    }

    @GetMapping
    public List<Livro> getLivros() {
        return livros;
    }
}

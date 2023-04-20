package com.example.javaWEBSPRINGL;

import models.Produto;
import models.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired // quando se coloca essa notação, o spring cria um objeto automaticamente
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome){
        Produto novoProduto = new Produto(nome);
        produtoRepository.save(novoProduto);
        return novoProduto;
    }

}

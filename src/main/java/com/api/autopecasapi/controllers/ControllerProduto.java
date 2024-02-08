package com.api.autopecasapi.controllers;

import com.api.autopecasapi.models.ProdutoModel;
import com.api.autopecasapi.services.ServiceProduto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/autopecas") //Rota de acesso

public class ControllerProduto {

    //Injeção do service produto
    final ServiceProduto serviceProduto;

    public ControllerProduto(ServiceProduto serviceProduto){
        this.serviceProduto = serviceProduto;
    }

    //metodos
    @PostMapping
    public ResponseEntity<Object> create(@RequestBody ProdutoModel produtoModel){
        var novoProduto = new ProdutoModel();
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceProduto.save(produtoModel));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>>getAllProdutos(){
        return ResponseEntity.status(HttpStatus.OK).body(serviceProduto.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object>procurarPorId(@PathVariable(value = "id") int id){
        Optional<ProdutoModel>produtoModelOptional = serviceProduto.findById(id);
        if(!produtoModelOptional.isPresent()){ //Caso o registro do id não exista //
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse registro não existe!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produtoModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object>deletarProduto(@PathVariable(value = "id") int id){
        Optional<ProdutoModel>produtoModelOptional = serviceProduto.findById(id);
        if(!produtoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse registro não existe, ou já foi excluido");
        }
        serviceProduto.delete(produtoModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("O registro foi excluido com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarProduto(@PathVariable(value = "id") int id, @RequestBody ProdutoModel novoProduto) {
        Optional<ProdutoModel> produtoOptional = serviceProduto.findById(id);
        if (!produtoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O registro não existe!");
        }

        ProdutoModel produtoExistente = produtoOptional.get();
        // Atualize os campos do produto existente com base nos dados do novo produto
        produtoExistente.setNome(novoProduto.getNome());
        produtoExistente.setValor(novoProduto.getValor());

        // Salve o produto atualizado no banco de dados
        ProdutoModel produtoAtualizado = serviceProduto.save(produtoExistente);

        // Retorne uma resposta com o produto atualizado
        return ResponseEntity.status(HttpStatus.OK).body(produtoAtualizado);
    }
}

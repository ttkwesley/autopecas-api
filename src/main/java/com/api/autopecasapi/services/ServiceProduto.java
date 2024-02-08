package com.api.autopecasapi.services;

import com.api.autopecasapi.models.ProdutoModel;
import com.api.autopecasapi.repositories.RepositoryProduto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ServiceProduto {

    //Ponto de injeção do repository
    final RepositoryProduto repositoryProduto;

    public ServiceProduto(RepositoryProduto repositoryProduto) { //Injeção via construct
        this.repositoryProduto = repositoryProduto;
    }

    //Metodo Create
    @Transactional
    public ProdutoModel save(ProdutoModel produtoModel) {
        return repositoryProduto.save(produtoModel);
    }

    //Metodo FindAll
    public List<ProdutoModel> findAll() {
        return repositoryProduto.findAll();
    }

    //Metodo findById
    public Optional<ProdutoModel> findById(int id) {
        return repositoryProduto.findById(id);
    }

    //Metodo de delete
    @Transactional
    public void delete(ProdutoModel produtoModel) {
        repositoryProduto.delete(produtoModel);
    }
}

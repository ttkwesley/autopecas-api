package com.api.autopecasapi.repositories;

import com.api.autopecasapi.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositoryProduto extends JpaRepository<ProdutoModel, Integer> {

}

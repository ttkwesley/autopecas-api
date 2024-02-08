package com.api.autopecasapi.controllers;

//Imports
import com.api.autopecasapi.models.ProdutoModel;
import com.api.autopecasapi.repositories.RepositoryProduto;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerProdutoTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    RepositoryProduto repositoryProduto;

    @Test
    void TesteCadastrarProduto() throws Exception {
        var produto = new ProdutoModel();
        produto.setId(1);
        produto.setNome("Furadeira");
        produto.setValor(26.50);
        Mockito.when(repositoryProduto.save(Mockito.any())).thenReturn(produto);

        mockMvc.perform(MockMvcRequestBuilders.post("/autopecas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"nome\":\"Furadeira\",\"valor\":26.50}"))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nome").value("Furadeira"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.valor").value(26.50))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    void testeRecuperarProdutos() throws Exception {
        var produto1 = new ProdutoModel();
        produto1.setId(1);
        produto1.setNome("Carriola");
        produto1.setValor(10.0);

        var produto2 = new ProdutoModel();
        produto2.setId(2);
        produto2.setNome("Martelo");
        produto2.setValor(7.70);

        List<ProdutoModel> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);

        when(repositoryProduto.findAll()).thenReturn(produtos);
        mockMvc.perform(MockMvcRequestBuilders.get("/autopecas"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(produtos.size()))
                .andDo(MockMvcResultHandlers.print());

    }

    @Test
    void testeProcurarPorId() throws Exception {
        var produto1 = new ProdutoModel();
        produto1.setId(1);
        produto1.setNome("Espatula");
        produto1.setValor(5.90);
        when(repositoryProduto.findById(1)).thenReturn(Optional.of(produto1));

        mockMvc.perform(MockMvcRequestBuilders.get("/autopecas/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.nome").value("Espatula"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.valor").value(5.90))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    void testeDeletarProduto() throws Exception {
        var produto1 = new ProdutoModel();
        produto1.setId(1);
        produto1.setNome("Cimento");
        produto1.setValor(60.00);

        when(repositoryProduto.findById(1)).thenReturn(Optional.of(produto1));

        mockMvc.perform(MockMvcRequestBuilders.delete("/autopecas/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("O registro foi excluido com sucesso"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    void testeAtualizarProduto() throws Exception {
        var produto1 = new ProdutoModel();
        produto1.setId(1);
        produto1.setNome("Espatula");
        produto1.setValor(9.90);
        when(repositoryProduto.findById(1)).thenReturn(Optional.of(produto1));

        var produtoAtualizado = new ProdutoModel();
        produtoAtualizado.setId(1);
        produtoAtualizado.setNome("Espatula");
        produtoAtualizado.setValor(6.90);
        when(repositoryProduto.save(any(ProdutoModel.class))).thenReturn(produtoAtualizado);

        mockMvc.perform(MockMvcRequestBuilders.put("/autopecas/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"nome\":\"Espatula\",\"valor\":6.90}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.nome").value("Espatula"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.valor").value(6.90))
                .andDo(MockMvcResultHandlers.print());
    }
    }

package com.dh.Integradora28.service;

import com.dh.Integradora28.DAO.ProdutoDao;
import com.dh.Integradora28.model.Produto;
import com.dh.Integradora28.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Map<Integer, Produto> buscarProdutos() {
        return repository.selectAll();
    }
    public Map<Integer, Produto> criarProduto(ProdutoDao dao) {
        Produto produto = new Produto(dao.getNome(), dao.getQuantidade(), dao.getDescricao());
        return repository.create(produto);
    }
    public String deletarProduto(Integer id) {
        repository.delete(id);
        return "Produto Deletado";
    }
}


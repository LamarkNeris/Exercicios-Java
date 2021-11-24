package com.dh.Integradora28.controller;

import com.dh.Integradora28.DAO.ProdutoDao;
import com.dh.Integradora28.model.Produto;
import com.dh.Integradora28.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Map<Integer, Produto>> postProduto(@RequestBody ProdutoDao dao) {
        return ResponseEntity.ok(service.criarProduto(dao));
    }
    @GetMapping
    public ResponseEntity<Map<Integer, Produto>> getAllProdutos() {
        return ResponseEntity.ok(service.buscarProdutos());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable Integer id) {
        return ResponseEntity.ok(service.deletarProduto(id));
    }
}

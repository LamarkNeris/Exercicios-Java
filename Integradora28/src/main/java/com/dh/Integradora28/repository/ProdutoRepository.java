package com.dh.Integradora28.repository;


import com.dh.Integradora28.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProdutoRepository implements IRepository {

    public static Map<Integer, Produto> produtoMap = new HashMap<>();


    @Override
    public Map<Integer, Produto> create(Object obj) {
        Integer id = produtoMap.size() + 1;

        Map<Integer, Produto> create = new HashMap<>();
        create.put(id, produtoMap.get(id));

        return create;
    }

    @Override
    public Map<Integer, Produto> selectAll() {
        return produtoMap;

    }


    @Override
    public void delete(Integer id) {
    produtoMap.remove(id);
    }
}
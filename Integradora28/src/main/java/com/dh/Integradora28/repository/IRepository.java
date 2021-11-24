package com.dh.Integradora28.repository;

import com.dh.Integradora28.model.Produto;

import java.util.Map;

public interface IRepository<Produto> {
    Map<Integer, Produto> create(Produto obj);
    Map<Integer, Produto> selectAll();
    void delete(Integer id);

}

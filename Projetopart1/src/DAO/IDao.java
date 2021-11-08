package DAO;

public interface IDao<T> {
    public T insert(T t);
    public void delete(String nome);
    public void select(String nome);
    public void selectAll();

}

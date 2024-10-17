package i_interface_heranca_banco_de_dados;

public interface SqlDMl {
    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}

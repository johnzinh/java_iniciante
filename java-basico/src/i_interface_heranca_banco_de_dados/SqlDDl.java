package i_interface_heranca_banco_de_dados;

public interface SqlDDl {
    void create(String query);
    void alter(String query);
    void drop(String query);
}

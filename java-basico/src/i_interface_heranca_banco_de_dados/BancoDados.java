package i_interface_heranca_banco_de_dados;

public interface BancoDados extends SqlDCL, SqlDDl, SqlDMl{

    void abrirConexao();
    void fecharConexao();
}

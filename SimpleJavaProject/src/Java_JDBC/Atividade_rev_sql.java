package Java_JDBC;

import java.sql.*;

public class Atividade_rev_sql {

    public static void main(String[] args) {

        try (Connection conexao = FabricaConexao.getConexao()) {
            String sql = "CREATE DATABASE IF NOT EXISTS ecommerce";
            Statement stmt = conexao.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Banco ECOMMERCE criado/verificado!");
        } catch (Exception e) {
            System.out.println("Erro ao criar o banco: " + e.getMessage());
        }

        try (Connection conexao = FabricaConexao.getConexao("ecommerce")) {

            criarTabelaProdutos(conexao);
            inserirProdutos(conexao);
            listarProdutos(conexao);
            listarProdutosComPrecoMaiorQue50(conexao);
            atualizarPrecoProduto(conexao);
            removerProduto(conexao);
            mostrarFuncoesAgregacao(conexao);
            criarTabelaVendas(conexao);
            inserirVendas(conexao);
            mostrarQuantidadeVendidaPorProduto(conexao);

            System.out.println("Execução finalizada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao executar exercícios: " + e.getMessage());
        }
    }

    // ================= Funções dos Exercícios =================

    static void criarTabelaProdutos(Connection conexao) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS PRODUTOS("
                + "ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
                + "NOME VARCHAR(100) NOT NULL,"
                + "PRECO DECIMAL(10,2) NOT NULL)";
        conexao.createStatement().executeUpdate(sql);
        System.out.println("Tabela PRODUTOS criada/verificada.");
    }

    static void inserirProdutos(Connection conexao) throws SQLException {
        String sql = "INSERT INTO PRODUTOS (NOME, PRECO) VALUES (?, ?)";
        PreparedStatement pstmt = conexao.prepareStatement(sql);

        pstmt.setString(1, "Teclado");
        pstmt.setDouble(2, 110.00);
        pstmt.executeUpdate();

        pstmt.setString(1, "Cabo HDMI");
        pstmt.setDouble(2, 70.00);
        pstmt.executeUpdate();

        pstmt.setString(1, "Cadeira de Escritório");
        pstmt.setDouble(2, 850.00);
        pstmt.executeUpdate();

        System.out.println("Produtos inseridos.");
    }

    static void listarProdutos(Connection conexao) throws SQLException {
        String sql = "SELECT * FROM PRODUTOS";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        System.out.println("=== Lista de Produtos ===");
        while (rs.next()) {
            System.out.printf("ID: %d | Produto: %s | Preço: %.2f\n",
                    rs.getInt("ID"), rs.getString("NOME"), rs.getDouble("PRECO"));
        }
    }

    static void listarProdutosComPrecoMaiorQue50(Connection conexao) throws SQLException {
        String sql = "SELECT * FROM PRODUTOS WHERE PRECO > 50";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        System.out.println("=== Produtos com preço > 50 ===");
        while (rs.next()) {
            System.out.printf("ID: %d | Produto: %s | Preço: %.2f\n",
                    rs.getInt("ID"), rs.getString("NOME"), rs.getDouble("PRECO"));
        }
    }

    static void atualizarPrecoProduto(Connection conexao) throws SQLException {
        String sql = "UPDATE PRODUTOS SET PRECO = 99.90 WHERE ID = 1";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        int linhas = pstmt.executeUpdate();
        System.out.println("Preço atualizado para o produto ID 1 (linhas afetadas: " + linhas + ")");
    }

    static void removerProduto(Connection conexao) throws SQLException {
        String sql = "DELETE FROM PRODUTOS WHERE ID = 2";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        int linhas = pstmt.executeUpdate();
        System.out.println("Produto ID 2 removido (linhas afetadas: " + linhas + ")");
    }

    static void mostrarFuncoesAgregacao(Connection conexao) throws SQLException {
        String sql = "SELECT COUNT(*) AS QTD, MAX(PRECO) AS MAIOR_VAL, MIN(PRECO) AS MENOR_VAL FROM PRODUTOS";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            System.out.printf("Qtd: %d | Maior: %.2f | Menor: %.2f\n",
                    rs.getInt("QTD"), rs.getDouble("MAIOR_VAL"), rs.getDouble("MENOR_VAL"));
        }
    }

    static void criarTabelaVendas(Connection conexao) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS VENDAS("
                + "ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
                + "PRODUTO_ID INT NOT NULL,"
                + "QUANTIDADE INT NOT NULL,"
                + "FOREIGN KEY (PRODUTO_ID) REFERENCES PRODUTOS(ID))";
        Statement stmt = conexao.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Tabela VENDAS criada/verificada.");
    }

    static void inserirVendas(Connection conexao) throws SQLException {
        String sql = "INSERT INTO VENDAS (PRODUTO_ID, QUANTIDADE) VALUES (?, ?)";
        PreparedStatement pstmt = conexao.prepareStatement(sql);

        pstmt.setInt(1, 1);
        pstmt.setInt(2, 5);
        pstmt.executeUpdate();

        pstmt.setInt(1, 3);
        pstmt.setInt(2, 2);
        pstmt.executeUpdate();

        System.out.println("Vendas inseridas.");
    }

    static void mostrarQuantidadeVendidaPorProduto(Connection conexao) throws SQLException {
        String sql = "SELECT PRODUTO_ID, SUM(QUANTIDADE) AS TOTAL FROM VENDAS GROUP BY PRODUTO_ID";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        System.out.println("=== Quantidade vendida por produto ===");
        while (rs.next()) {
            System.out.printf("Produto ID: %d | Quantidade: %d\n",
                    rs.getInt("PRODUTO_ID"), rs.getInt("TOTAL"));
        }
    }
}

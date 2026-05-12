package com.example.projetoPW1.modelo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Dailane de Souza Florencio
 *
 * Classe que implementa o padrão DAO para a entidade Assinatura
 * Assinatura { id, nome, descricao, preco, tipo }
 */
public class AssinaturaDAO {

    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/aconchegoecommerce";
    private static final String JDBC_USUARIO = "aconchegoecommerce";
    private static final String JDBC_SENHA = "pw1smd";

    public List<Assinatura> obterTodos() {
        List<Assinatura> resultado = new ArrayList<Assinatura>();
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, nome, descricao, preco, tipo FROM assinaturas");
            while (resultSet.next()) {
                Assinatura assinatura = new Assinatura();
                assinatura.setId(resultSet.getInt("id"));
                assinatura.setNome(resultSet.getString("nome"));
                assinatura.setDescricao(resultSet.getString("descricao"));
                assinatura.setPreco(resultSet.getFloat("preco"));
                assinatura.setTipo(resultSet.getString("tipo"));
                resultado.add(assinatura);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
        return resultado;
    }

    public Assinatura obterPorId(int id) {
        Assinatura assinatura = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, nome, descricao, preco, tipo FROM assinaturas WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                assinatura = new Assinatura();
                assinatura.setId(resultSet.getInt("id"));
                assinatura.setNome(resultSet.getString("nome"));
                assinatura.setDescricao(resultSet.getString("descricao"));
                assinatura.setPreco(resultSet.getFloat("preco"));
                assinatura.setTipo(resultSet.getString("tipo"));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
        return assinatura;
    }
    
    public Assinatura obterPorNome(String nome) {
        Assinatura assinatura = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, nome, descricao, preco, tipo FROM assinaturas WHERE nome = ?");
            preparedStatement.setString(1, nome);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                assinatura = new Assinatura();
                assinatura.setId(resultSet.getInt("id"));
                assinatura.setNome(resultSet.getString("nome"));
                assinatura.setDescricao(resultSet.getString("descricao"));
                assinatura.setPreco(resultSet.getFloat("preco"));
                assinatura.setTipo(resultSet.getString("tipo"));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
        return assinatura;
    }

    public boolean inserir(String nome, String descricao, float preco, String tipo) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO assinaturas (nome, descricao, preco, tipo) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, descricao);
            preparedStatement.setFloat(3, preco);
            preparedStatement.setString(4, tipo);
            sucesso = (preparedStatement.executeUpdate() == 1);
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }

    public boolean atualizar(String nome, String descricao, float preco, String tipo, int id) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE assinaturas SET nome = ?, descricao = ?, preco = ?, tipo = ? WHERE id = ?");
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, descricao);
            preparedStatement.setFloat(3, preco);
            preparedStatement.setString(4, tipo);
            preparedStatement.setInt(5, id);
            sucesso = (preparedStatement.executeUpdate() == 1);
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }

    public boolean remover(int id) {
        boolean sucesso = false;
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM assinaturas WHERE id = ?");
            preparedStatement.setInt(1, id);
            sucesso = (preparedStatement.executeUpdate() == 1);
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        return sucesso;
    }

}

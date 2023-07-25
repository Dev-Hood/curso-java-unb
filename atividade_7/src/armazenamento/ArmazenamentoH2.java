package armazenamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import calculadora.Nodo;
import calculadora.Operacao;

public class ArmazenamentoH2 implements Armazenamento{

	private Connection connection;
	
	public ArmazenamentoH2() {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "tallys", "1234");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
	
	@Override
	public void salvarExpressao(String id, String expressao) {
		try (PreparedStatement pr = connection.prepareStatement("INSERT INTO exprecoes (id,exprecao) VALUES (?, ?)")) {
			pr.setString(1, id);
			pr.setString(2, expressao);
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void salvarOperacao(String id, Nodo operacao) {
		 try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO operacoes (id, operacao) VALUES (?, ?)")) {
	            preparedStatement.setString(1, id);
	            preparedStatement.setObject(2, operacao, Types.OTHER);
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void salvarResultado(String id, int resultado) {
		try (PreparedStatement pr = connection.prepareStatement("INSERT INTO resultados (id,resultado) VALUES (?, ?)")) {
			pr.setString(1, id);
			pr.setInt(2, resultado);
			pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String recuperarExpressao(String id) {
		try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT exprecao FROM exprecoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return resultSet.getString("exprecao"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public Operacao recuperarOperacao(String id) {
		try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT operacao FROM operacoes WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return  (Operacao) resultSet.getObject("operacao"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public int recuperarResultado(String id) {
		try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT resultado FROM resultados WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            	return resultSet.getInt("resultado"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
	}

	@Override
	public List<String> listarExpressoes() {
		// TODO Auto-generated method stub
		return null;
	}

}

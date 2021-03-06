package seguridadjee.blog.dao;

import java.sql.SQLException;

import seguridadjee.blog.model.Usuario;

public interface UsuarioDao {
	public Usuario agregar(Usuario u) throws SQLException;
	public Usuario autenticar(String nombre, String clave) throws SQLException;
}

package seguridadjee.blog.service;

import seguridadjee.blog.model.Usuario;

public interface UsuarioService {
	public Usuario agregarUsuario(Usuario u);
	public Usuario autenticar(String nombre, String clave);
}

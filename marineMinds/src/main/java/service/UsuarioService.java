package service;

import model.usuario.Usuario;

import java.util.HashMap;
import java.util.Map;

public class UsuarioService implements IUsuarioService{

    Map<Long, Usuario> mapUsuario;
    public UsuarioService(){
        this.mapUsuario = new HashMap<>();
    }

    @Override
    public void criarUsuario(Usuario usuario) {
        mapUsuario.put(usuario.getIdUsuario(), usuario);
    }

    @Override
    public void atualizarSenha(Long id, String senha) {
        Usuario usuario = mapUsuario.get(id);
        if (usuario == null){
            throw new IllegalArgumentException("Usuário não encontrado");
        }
        usuario.setSenha(senha);
    }

    @Override
    public void deletarUsuario(Long idUsuario) {
        mapUsuario.remove(idUsuario);
    }
}

package com.mrm.service;

import com.mrm.model.usuario.Usuario;

public interface IUsuarioService {
    void criarUsuario(Usuario usuario);
    void atualizarSenha(Long id, String senha);
    void deletarUsuario(Long idUsuario);
}

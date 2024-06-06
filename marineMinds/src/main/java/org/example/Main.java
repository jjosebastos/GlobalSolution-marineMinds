package org.example;

import com.mrm.model.usuario.Endereco;
import com.mrm.model.usuario.Telefone;
import com.mrm.model.usuario.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            Usuario jose = new Usuario();
            Boolean continua = true;
            String resp;

            long idUsuario;
            String userName;
            String senha;
            Endereco endereco;
            Telefone telefone;

            while (continua){
                System.out.println("Cadastro de usuário!");
                System.out.println("Informe o ID do usuario: ");
                idUsuario = in.nextLong();
                jose.setIdUsuario(idUsuario);

                System.out.println("Informe o username do usuario: ");
                userName = in.next();
                jose.setUserName(userName);

                System.out.println("Informe a senha do usuario: ");
                senha = in.next();
                jose.setSenha(senha);

                System.out.println("Cadastro de endereço: ");
                System.out.println("Informe o endereço no formato (rua,numero,bairro,cidade,cep,uf): ");
                endereco = new Endereco(in.next(), in.next(), in.next(), in.next(), in.next(), in.next());
                jose.setEndereco(endereco);

                System.out.println("Cadastro de telefone: ");
                System.out.println("Informe o telefone no formato (id, ddi, ddd, numero,tipo): ");
                telefone = new Telefone(in.next(), in.next(), in.next(), in.next());
                jose.setTelefone(telefone);

                System.out.println("Deseja continuar cadastros de usuários: (sim/nao)");
                resp = in.next();

                continua = resp == "sim";

            }
        System.out.println("Usuario cadastrado: " + jose );

        }
    }

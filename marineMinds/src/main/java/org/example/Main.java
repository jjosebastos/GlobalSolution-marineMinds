package org.example;

import model.usuario.Endereco;
import model.usuario.Telefone;
import model.usuario.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            Usuario jose = new Usuario();
            String resp = "sim";


            long idUsuario;
            String userName;
            String senha;
            Endereco endereco;
            Telefone telefone;

            while (resp == "sim"){
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
                System.out.println("Informe o endereço no formato (id,rua,numero,bairro,cidade,cep,uf): ");
                String enderecoStr = in.next();
                String enderecoCad[] = enderecoStr.split(",");

                endereco = new Endereco(enderecoCad[0], enderecoCad[1],
                        enderecoCad[2], enderecoCad[3], enderecoCad[4], enderecoCad[5]);
                jose.setEndereco(endereco);

                System.out.println("Cadastro de telefone: ");
                System.out.println("Informe o telefone no formato (id, ddi, ddd, numero,tipo): ");
                String telefoneStr = in.next();
                String telefoneCad [] = telefoneStr.split(",");

                telefone = new Telefone(Long.parseLong(telefoneCad[0]), telefoneCad[1], telefoneCad[2],
                        telefoneCad[3], telefoneCad[5]);
                jose.setTelefone(telefone);

                System.out.println("Deseja continuar cadastros de usuários: (sim/nao)");
                resp = in.nextLine();
            }
        in.close();


        }
    }

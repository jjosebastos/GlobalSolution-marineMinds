package org.example;

import com.mrm.model.RequisicaoLimpeza;
import com.mrm.model.usuario.Endereco;
import com.mrm.model.usuario.Telefone;
import com.mrm.model.usuario.Usuario;
import com.mrm.service.RequisicaoLimpezaService;
import com.mrm.service.UsuarioService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            Usuario usuario = new Usuario();
            Endereco endereco = new Endereco();
            Telefone telefone = new Telefone();
            RequisicaoLimpeza requisicaoLimpeza = new RequisicaoLimpeza();
            RequisicaoLimpezaService requisicaoLimpezaService = new RequisicaoLimpezaService();

            UsuarioService joseService = new UsuarioService();

            Boolean continua = true;
            Boolean requisicao = true;
            String resp, respReq;

            while (continua){

                /**
                 * USUARIO
                 */
                System.out.println("!------ Cadastro de usuário ------!");

                System.out.print("Informe o ID do usuario: ");
                usuario.setIdUsuario(in.nextLong());

                System.out.print("Informe o nome de usuario: ");
                usuario.setUserName(in.next());

                System.out.print("Informe a senha do usuario: ");
                usuario.setSenha(in.next());

                /**
                 * ENDERECO
                 */
                System.out.println("!------ Cadastro de endereço ------!");

                System.out.print("Informe a rua do endereço a ser cadastrado: ");
                endereco.setRua(in.next());

                System.out.print("Informe o numero da casa do endereco a ser cadastrado: ");
                endereco.setNumero(in.next());

                System.out.print("Informe o bairro do endereco a ser cadastrado: ");
                endereco.setBairro(in.next());

                System.out.print("Informe a cidade do endereço a ser cadastrado: ");
                endereco.setCidade(in.next());

                System.out.print("Informe a UF do endereço a ser cadastrado: ");
                endereco.setUf(in.next());

                System.out.print("Informe o CEP do endereço a ser cadastrado: ");
                endereco.setCep(in.next());

                usuario.setEndereco(endereco);

                /**
                 * TELEFONE
                 */

                System.out.println("!------ Cadastro de endereço ------!");

                System.out.print("Informe o DDI do telefone: ");
                telefone.setDdi(in.next());

                System.out.print("Informe o DDD do telefone: ");
                telefone.setDdd(in.next());

                System.out.print("Informe o numero do telefone: ");
                telefone.setNumero(in.next());

                System.out.print("Informe o tipo do telefone: ");
                telefone.setTipo(in.next());

                usuario.setTelefone(telefone);

                System.out.println("Deseja continuar cadastros de usuários: (sim/nao)");
                resp = in.next();

                joseService.criarUsuario(usuario);

                continua = resp == "sim";

            }
        System.out.println("Lista de usuários cadastrados: ");
        joseService.pesquisarUsuarios();

            while (requisicao){
                System.out.println("Cadastro de requisição!");

                System.out.print("Informe o id da requisição: ");
                requisicaoLimpeza.setIdRequisicao(in.nextLong());

                System.out.print("Descreva sobre o ocorrido: ");
                requisicaoLimpeza.setDescricao(in.next());

                System.out.print("Informe a data da requisição (YYYY-MM-DD): ");
                String dataStr = in.next();
                LocalDate data = LocalDate.parse(dataStr, DateTimeFormatter.ISO_LOCAL_DATE );
                requisicaoLimpeza.setData(data);

                System.out.print("Informe a hora da requisição (formato HH:MM): ");
                String horaStr = in.next();
                LocalTime hora = LocalTime.parse(horaStr, DateTimeFormatter.ISO_LOCAL_TIME);
                requisicaoLimpeza.setHora(hora);

                System.out.print("Qual é o tipo do lixo encontrado? ");
                requisicaoLimpeza.setTipoLixo(in.next());

                requisicaoLimpezaService.adicionarRequisicao(requisicaoLimpeza);

                System.out.println("Deseja relatar mais uma requisição? (sim/nao)");
                respReq = in.next();
                requisicao = respReq == "sim";
            }
        requisicaoLimpezaService.pesquisarRequisicoes();
    }
}

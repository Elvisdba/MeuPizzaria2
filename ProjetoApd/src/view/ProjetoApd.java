
package view;

import model.Pedido;
import model.Item;
import model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoApd {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();
        Item item = new Item();
        
        int op,qtd;
        String nome,endereco,senha,email,rg,codeUsuario, cpf,cep,telefone,sabor,resposta;
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar cliente: ");
        System.out.println("2 - Realizar pedido:  ");
       
        
        op = entrada.nextInt();
        
        switch(op){
            
            case 1:
                System.out.println("--------Cadastro-----:");
                System.out.println("Informe seus dados: ");
                System.out.println("Nome: ");
                entrada.next();
                nome = entrada.nextLine();  
                System.out.println("Rg: ");
                rg = entrada.nextLine();
                System.out.println("Senha: ");
                senha = entrada.nextLine();
                
                System.out.println("Endereco: "); 
                endereco = entrada.nextLine();
                
                System.out.println("Nome de usuario: ");
                codeUsuario = entrada.nextLine();
                
                System.out.println("Cep: ");
                cep = entrada.nextLine();
                
                System.out.println("Cpf: ");
                cpf = entrada.nextLine();
                
                System.out.println("Telefone: ");
                telefone = entrada.nextLine();
                
                System.out.println("Email: ");
                email = entrada.nextLine();
                cliente.setNome(nome);
                cliente.setCep(cep);
                cliente.setCodUsuario(codeUsuario);
                cliente.setCpf(cpf);
                cliente.setEmail(email);
                cliente.setSenha(senha);
                cliente.setTelefone(telefone);
                cliente.setRg(rg);
                cliente.setEndereco(endereco);
                
                ArrayList <Cliente> clientes = new ArrayList <Cliente>();
                clientes.add(cliente);
                System.out.println(cliente.toString());
                break;
              
            case 2:
                System.out.println("Realizar pedido: ");
                System.out.println("qual a quuantidade de pizza? ");
                qtd = entrada.nextInt();
                for(int i=0;i<qtd;i++){
                System.out.println("Quais são os sabores das pizzas ?" );
                sabor = entrada.nextLine();
                }
                System.out.println("Dejesa refrigerante? ");
                resposta = entrada.nextLine();
                if(resposta  =="nao"){
                    System.out.println("Ok");
                }else if(resposta == "sim"){
                    System.out.println("Quantos refrigerantes?");
                    qtd = entrada.nextInt();
                }
                item.setQuantidade(qtd);
                item.setPrecoUnid(qtd*20);
                    System.out.println(item.toString());
                
            break;
        
        }
    }
    
}

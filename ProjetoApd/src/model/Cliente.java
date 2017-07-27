
package model;

/**
 *
 * @author flavio022
 */
public class Cliente {
    private String nome;
    private String senha;
    private String codUsuario;
    private String endereco;
    private String cep;
    private String rg;
    private String cpf;
    private int id;
    private String telefone;
    private String email;
    private Pedido pedido;

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }
    
    
    public Cliente(){
    
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public int getId() {
        return id;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dados pessoais:\n "+"nome:"+this.nome+" cpf: "+this.cpf+" rg:"+this.rg+" telefone:"+this.telefone+" cep: "+this.cep+"Usuario: "+this.codUsuario+" senha: "+this.senha+" Endereço: "+this.endereco;
    }

    
    public void logar(){
        
    }
    public void addProdutoCarrinho(){
    
    }
    
    public void buscarProduto(){
    
    }
    
    public void alterarDados(){
        
    }
    
    public void realizarPagamento(){
        
    }
    
}

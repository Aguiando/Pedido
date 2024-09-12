import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private int indexEnderecoAtual = 0;
    private List<EnderecoCliente> enderecos = new ArrayList<EnderecoCliente>(10);

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public EnderecoCliente getEnderecoAtual() { return enderecos.get(indexEnderecoAtual); }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setEmail(String email) {
        if(email == null && email.isEmpty()){
            System.out.println("Email não pode ser vazio.");
            return;
        }
        this.email = email;
    }
    public void setTelefone(String telefone) {
        if(telefone == null && telefone.isEmpty()){
            System.out.println("Telefone não pode ser vazio.");
            return;
        }
        this.telefone = telefone;
    }
    public void setIndexEnderecoAtual(int indexEnderecoAtual) {
        if(indexEnderecoAtual < 0){
            System.out.println("Index não pode ser menor que zero.");
            return;
        }
        if(indexEnderecoAtual >= enderecos.size()){
            System.out.println("Index não pode ser maior que numero de endereços cadastrados.");
            return;
        }
        this.indexEnderecoAtual = indexEnderecoAtual;
    }

    public void cadastrarEndereco(String rua, String bairo, String cep, String estado, int num){
        enderecos.add(new EnderecoCliente(rua, bairo, cep, estado, num));
        indexEnderecoAtual = enderecos.size()-1;
    }

    @Override
    public String toString() {
        return "Nome:" + nome +
                "\nEmail:" + email +
                "\nTelefone:" + telefone +
                "\nIndexEnderecoAtual:" + indexEnderecoAtual;
    }
}

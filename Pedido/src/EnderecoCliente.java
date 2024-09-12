public class EnderecoCliente {
    private String rua;
    private String bairro;
    private String cep;
    private String estado;
    private int num;

    public EnderecoCliente(String rua, String bairro, String cep, String estado, int num) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public String getEstado() {
        return estado;
    }
    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }

    public void setNum(int num) {
        if(num < 0 || num > 999){
            System.out.println("Numero de casa invalida");
        }else{
            this.num = num;
        }
    }
    public void setRua(String rua) {
        if(rua == null && rua.isEmpty()){
            System.out.println("Rua não pode ser vazia");
        }else{
            this.rua = rua;
        }
    }
    public void setEstado(String estado) {
        if(estado == null && estado.isEmpty()){
            System.out.println("Estado não pode ser vazia");
        }else{
            this.estado = estado;
        }
    }
    public void setCep(String cep) {
        if(cep == null && cep.isEmpty()){
            System.out.println("CEP não pode ser vazio");
        }else{
            this.cep = cep;
        }
    }
    public void setBairro(String bairro) {
        if(bairro == null && bairro.isEmpty()){
            System.out.println("Bairro não pode ser vazio");
        }else{
            this.bairro = bairro;
        }
    }

    public void cadastrarEndereco(String novoEstado, String novoCep, String novoBairro, String novaRua, int novoNum) {
        this.rua = novaRua;
        this.bairro = novoBairro;
        this.cep = novoCep;
        this.estado = novoEstado;
        this.num = novoNum;
    }

    @Override
    public String toString() {
        return "EnderecoCliente{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                ", num=" + num +
                '}';
    }
}

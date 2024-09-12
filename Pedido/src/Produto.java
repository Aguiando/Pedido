public class Produto {
    private String nome;
    private double valor;
    private double largura;
    private double altura;

    public Produto(String nome, double valor, double largura, double altura) {
        this.nome = nome;
        this.valor = valor;
        this.largura = largura;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public double getLargura() {
        return largura;
    }
    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        if(nome == null && nome.isEmpty()){
            System.out.println("Nome não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }
    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("O valor nao pode ser negativo.");
        } else {
            this.valor = valor;
        }
    }
    public void setLargura(double largura) {
        if (largura <= 0) {
            System.out.println("A largura deve ser maior que 0.");
        } else {
            this.largura = largura;
        }
    }
    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("Altura deve ser maior que 0.");
        } else {
            this.altura = altura;
        }
    }

    @Override
    public String toString() {
        return "Produto" +
                "\nNome:" + nome +
                "\nValor=" + valor +
                "\nLargura=" + largura +
                "\nAltura=" + altura;
    }
}



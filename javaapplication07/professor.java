package javaapplication07;
        //clasee
public class professor {
        //atributos
    private int idade;
    private String nome;
    private int matricula;
    private String email;

    public professor(int idade, String nome, int matricula, String email) {
        this.idade = idade;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    
        //method get
    public int getIdade() {
        return idade;
    }
        //method set
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}

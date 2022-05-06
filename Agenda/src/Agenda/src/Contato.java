package Agenda.src;

public class Contato {

    private int id;
    private String nome;
    private String telefone;
    private String email;
    
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String nome){
        this.telefone = telefone;
    }

    public void setEmail(String nome){
        this.email = email;
    }
    
    public String toString(){
        return "id: " + id + " " + "Nome: " + nome + " " + "Telefone: " + telefone + " " + "Email: " + email;
    }


}

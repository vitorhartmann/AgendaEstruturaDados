package Agenda.src;

public class Contato {

    private int id;
    private String nome;
    private String telefone;
    private String email;
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }


    public void setNome(String nome){

    }

    public void setTelefone(String nome){
        
    }

    public void setEmail(String nome){
        
    }

    public String toString(){
        return "id: " + id + "Nome: " + nome + "Telefone: " + telefone + "Email: " + email;
    }


}

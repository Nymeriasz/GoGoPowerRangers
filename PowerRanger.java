package GoGoPowerRangers;

public class PowerRanger {
    protected String nome;

    public void morfar(){

    }
    public void morfar(String armadura){
        System.out.println(nome+" está morfando com "+armadura);
    }
    public void morfar(String armadura, String arma){
        System.out.println(nome+" está morfando com "+armadura+" e com "+arma);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

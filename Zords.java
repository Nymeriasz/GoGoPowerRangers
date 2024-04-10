package GoGoPowerRangers;

public class Zords implements Zord {
    private String tipo;
    private String habilidades;
    private PowerRanger piloto;

    public Zords() {
        this.tipo = tipo;
        this.habilidades=habilidades;
    }

    @Override
    public void pilotar(PowerRanger piloto) {
        this.piloto = piloto;
        System.out.println(piloto.getNome() + " está pilotando o Zord " + tipo);
    }

    @Override
    public void mover(String direcao) {
        System.out.println("Zord "+tipo+" movendo-se para "+direcao+"!");
    }

    @Override
    public void atacar() {
        System.out.println("Zord "+tipo+" atacando!");
    }

    @Override
    public void defender() {
        System.out.println("Zord "+tipo+" defendendo!");
    }

    @Override
    public void transformar() {
        System.out.println("Zord "+tipo+" se transformando!");
    }

    public String getTipo() {
        return tipo;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
}

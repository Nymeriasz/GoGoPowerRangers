package GoGoPowerRangers;
public class Main {
    public static void main(String[] args) {

        PowerRanger amarela = new RangerAmarelo();
        PowerRanger rosa = new RangerRosa();

        amarela.setNome("Trini");
        rosa.setNome("Kimberly");

        amarela.morfar("Sabretooth Tiger");
        rosa.morfar("Pterodáctilo", "Power Bow");

        System.out.println();

        Megazord m = new Megazord();
        Zords z1 = new Zords();
        Zords z2 = new Zords();

        z1.setTipo("Sabretooth Tiger");
        z1.setHabilidades("Agilidade, velocidade e poder de ataque");

        z2.setTipo("Pterodáctilo");
        z2.setHabilidades("Capacidade de voo e ataques aéreos");

        m.adicionar(z1);
        m.adicionar(z2);

        m.exibir();

        z1.pilotar(amarela);
        z1.atacar();
        z1.mover("direita");
        z1.defender();
        z1.transformar();

        System.out.println("--------------------------");

        z2.pilotar(rosa);
        z2.defender();
        z2.transformar();
        z2.mover("esquerda");
        z2.atacar();

    }
}
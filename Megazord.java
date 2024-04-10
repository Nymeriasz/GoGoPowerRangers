package GoGoPowerRangers;

import java.util.ArrayList;

public class Megazord {
    ArrayList<Zords> listazord = new ArrayList<>();

    public void adicionar(Zords zord){
        listazord.add(zord);
    }
    public void exibir(){
        for (Zords zord:listazord) {
            System.out.println("Zord: "+zord.getTipo());
            System.out.println("Habilidades: "+zord.getHabilidades());
            System.out.println();
        }
    }
}

package ThreadGUI;

public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile();
        Producteur Producer1 = new Producteur(pile, "Producer1");
        Producteur Producer2 = new Producteur(pile, "Producer2");
        Consommateur Consommateur1 = new Consommateur(pile, "Consommateur1");
        Consommateur Consommateur2 = new Consommateur(pile, "consommateur2");

    }

}

package ThreadGUI;

public class Consommateur implements Runnable {
    Pile pile;
    String name;

    public Consommateur(Pile pile, String name) {
        this.pile = pile;
        this.name = name;
        Thread t=new Thread(this,name);
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true) {
            pile.depiler(name);

        }
    }
}

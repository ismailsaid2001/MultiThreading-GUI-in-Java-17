package ThreadGUI;

public class Producteur implements Runnable {
    Pile pile;
    String name;
    public Producteur (Pile pile,String name) {
        this.name=name;
        this.pile=pile;
        Thread t=new Thread(this,name);
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true) {
            pile.empiler(i++,name);

        }
    }
}

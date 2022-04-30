package ThreadGUI;

public class Pile {
    int[] pile = new int[10];
    int count = 0;

    public synchronized void empiler(int num, String name) {

        while (count == 9) {
            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("interruption detected !!!");
            }

        }
        count++;
        pile[count] = num;
        System.out.println(name + " :" + "empile dans la case d'indice  " + count + " la valeur :" + num);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("interruption detected !!!");
        }
        notifyAll();
    }

    public synchronized void depiler(String name) {

        while (count == 0) {

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("interruption detected !!!");
            }
        }
        count--;
        System.out.println(name + " :" + "deplier de la case d'indice  " + count + " la valeur :" + pile[count]);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("interruption detected !!!");
        }
        notifyAll();

    }
}

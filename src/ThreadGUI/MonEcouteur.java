package ThreadGUI;

import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.Collections;

public class MonEcouteur implements ActionListener, WindowListener, MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("it is clicked  now ");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("it is entered ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("it is out of window");

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("it is activated now");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int confirmed = JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir quitter?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("is is desactivated ");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("it is  deiconfied ");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("it is iconfied ");

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("opening");
    }

    GUI ihm;

    MonEcouteur(GUI G) {
        ihm = G;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ihm.b_demarrer) {
            int consommateurs = 0;
            int producteurs = 0;
            try {
                consommateurs = Integer.parseInt(ihm.nb_consommateurs.getText());
            } catch (NumberFormatException e1) {

                System.err.println("Unable to convert String  " + ihm.nb_consommateurs.getText()
                        + " to int. A NumberFormatException Occured, Ensure the string contains only valid numbers " + e);
            }

            try {
                producteurs = Integer.parseInt(ihm.nb_producteurs.getText());
            } catch (NumberFormatException e1) {

                System.err.println("Unable to convert String  " + ihm.nb_producteurs.getText()
                        + " to int. A NumberFormatException Occured, Ensure the string contains only valid numbers " + e);
            }
            for (int i = 0; i < producteurs; i++) {
                new Producteur(ihm.pile, "Producer" + i);

            }
            for (int i = 0; i < consommateurs; i++) {
                new Consommateur(ihm.pile, "Consommateur" + i);


            }

        } else if (e.getSource() == ihm.b_afficher) {
            ihm.MultiThreading.setText("");
            for (int i : ihm.pile.pile) {
                ihm.MultiThreading.append(String.valueOf(i) + "\n");

            }


        }
    }
}

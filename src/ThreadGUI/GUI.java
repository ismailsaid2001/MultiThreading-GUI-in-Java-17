package ThreadGUI;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Vector;

    public class GUI {
        Pile pile =new Pile();
        JFrame f; // the main frame
        //Buttons :
        JButton b_demarrer;
        JButton b_afficher;
        JPanel pnorth;
        JPanel psouth;
        JLabel Label_nbconsommateurs;
        JLabel Label_nbprducteurs;
        //TextFiels
        JTextField nb_consommateurs;
        JTextField nb_producteurs;
        JTextArea MultiThreading=new JTextArea("Contenu de la pile :");
        public GUI() {
            f = new JFrame("MultiThreading en Java");//construction of the frame
            pnorth = new JPanel();
            f.setLayout(new BorderLayout());
            pnorth.setLayout(new GridLayout(2, 2));
            // constructing labels
            Label_nbprducteurs = new JLabel("nb de Consommateurs");
            Label_nbconsommateurs = new JLabel("nb de Producteurs");
            Label_nbconsommateurs.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            Label_nbprducteurs.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            //constructing TextFields
            nb_producteurs = new JTextField(10);
            nb_consommateurs = new JTextField(10);
            // adding Labels and !text fields in the grid
            pnorth.add(Label_nbprducteurs, 0, 0);
            pnorth.add(nb_producteurs, 0, 1);
            pnorth.add(Label_nbconsommateurs, 1, 0);
            pnorth.add(nb_consommateurs, 1, 1);
            f.add(pnorth, BorderLayout.NORTH);
            //Text Area Creation
            MultiThreading=new JTextArea();
            f.add(MultiThreading,BorderLayout.CENTER);
            Font font = new Font("Verdana", Font.BOLD, 20);
            MultiThreading.setFont(font);
            MultiThreading.setForeground(new Color(128, 150, 240));
            MultiThreading.setBackground(new Color(150, 128, 128));
            psouth = new JPanel();
            //creating Buttons and adding them to psouth
            b_demarrer=new JButton("demarrer");
            b_afficher=new JButton("afficher");
            psouth.add(b_demarrer);
            psouth.add(b_afficher);
            //
            f.add(psouth,BorderLayout.SOUTH);
            f.pack();//The pack method sizes the frame so that all its contents are at or above their preferred sizes
            f.setVisible(true); // to make visible the frame
            MonEcouteur me = new MonEcouteur(this);
            b_demarrer.addActionListener(me);
            b_afficher.addActionListener(me);
            f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            f.addWindowListener(me);
        }
        public static void main(String[] args)  {
            GUI mf = new GUI();
        }
    }
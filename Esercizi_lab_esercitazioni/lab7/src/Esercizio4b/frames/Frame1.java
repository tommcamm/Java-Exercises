package Esercizio4b.frames;

import Esercizio4b.panels.Panel1;

import javax.swing.*;
import java.awt.*;

public class Frame1 {
    private JFrame frame;

    public Frame1( String name, int x, int y, int w, int h){
        frame= new JFrame( name);
        frame.setLocation( x, y);
        frame.setSize( w, h);

        gui();

        frame.setVisible( true);

    }

    public void gui(){
        Panel1 panel= new Panel1();
        frame.add( panel.getPanel());

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}

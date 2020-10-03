/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import view.homeBaru;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_homeBaru {
    
    homeBaru home;

    public c_homeBaru(homeBaru home) {
        this.home = home;
        home.setVisible(true);
        home.getStart().addActionListener(new btnStart());
    }

    private static class btnStart implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            home.getGambar().setIcon();
        }
    }

    
    
    
    
}

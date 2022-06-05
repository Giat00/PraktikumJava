/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import frame.PenggunaCreateForm;
//import frame.PenggunaCreateFrame;
import frame.PenggunaViewForm;

import javax.swing.*;


/**
 *
 * @author GIAT
 */
public class Main {
    public static void main(String[] args) {
//        PenggunaCreateFrame frame = new PenggunaCreateFrame();
//        frame.meletakkanKomponen();
//        frame.menambahkanListener();
//        frame.setVisible(true);



        PenggunaViewForm vf = new PenggunaViewForm();
        vf.setContentPane(vf.panelMain);
        vf.pack();
        vf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vf.setLocationRelativeTo(null);
        vf.setVisible(true);
    }
}

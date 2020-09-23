/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PeriodicTable;

/**
 *
 * @author MKS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}

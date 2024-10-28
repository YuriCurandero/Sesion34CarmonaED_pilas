/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34carmonaed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri
 */
public class Sesion34CarmonaED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de Pila
        Stack<Integer> pilaCarmona = new Stack<>();
        
        pilaCarmona.push(100);
        pilaCarmona.push(150);
        pilaCarmona.push(160);
        pilaCarmona.push(40);
        pilaCarmona.push(90);
        
        JOptionPane.showMessageDialog(null, "Datos en la pila ordenada es: \n"+pilaCarmona);
    }
    
}

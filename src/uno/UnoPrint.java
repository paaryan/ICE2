/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno;

/**
 *user interaction class
 * high cohesion 
 * generation of cards delegated to another
 * @author rog
 */
public class UnoPrint {
      public static void main(String[] args) {
        //print 52 cards
        //call the method generated() by the object
        UnoGenerator ins=new UnoGenerator();
        ins.generate();// cards are generated now
        for (Uno c : ins.deck){ //access array desk
            System.out.println(c.getS()+ " " + c.getV());
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno;

/**
 * delegation principle- Separation of concern high cohesion generate 52 cards
 * and save in array
 *
 * @author rog
 */
public class UnoGenerator {

    private int size = 60; // + 4;
    Uno[] deck = new Uno[size];  //64 card

    public void generate() {
//        for each loop\datatype var: redaing location
        int c = 0;
        for (Uno.Suit s : Uno.Suit.values())//hearts,1
        {
            for (Uno.Value v : Uno.Value.values()) {
                 deck[c]= new Uno(s,v);
               //  deck[0]
                 c++;
            }
        }
    }
}

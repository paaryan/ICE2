/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Uno and generator class are in loose coupling and print is in cohesion */
/*This class follow loose coupling with generator class because it only give the size information to 
the generator class.It allow the changes in the classes that 
if we want to add a card it is nescessary to increase the total length of the 
loop in this code if we want to add a card name EXTRA it is necessary to increase 
the size from 60 to 64.*/
/*To convert the card code to Uno we just change the card names and the color 
for this class. So it is cohesion while changing the code to Uno from cards   */
package uno;

/**
 *
 * @author rog
 */
public class Uno {
//enum-loose couplin, value and type safety
    // enum is an user defined data type and constants, 
    public enum Suit {red, yellow, green, blue};
    public enum Value{ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD}   //EXTRA};
    private Suit S;
    private Value v;  
    public Uno(Suit s, Value v){
        this.S=s;
        this.v=v;
    }
//    here the datatype for s and v is enum

    /**
     * @return the S
     */
    public Suit getS() {
        return S;
    }
    /**
     * @param S the S to set
     */
    public void setS(Suit S) {
        this.S = S;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
    
}

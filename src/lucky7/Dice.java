/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucky7;

/**
 *
 * @author jame1850
 */
public class Dice {
    int upside = 1;
    
    public void roll() {
        upside = (int) (Math.random() * 6) + 1;
    }
    
    public int getValue() {
        return upside;
    }
}

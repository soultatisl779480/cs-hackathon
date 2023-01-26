/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

/**
 *
 * @author adamchen
 */
public class Motorcycle extends Vehicle{

    public Motorcycle(){
        super(350, 2, 2);
    }

  public int finalScoreCalc(int r ){
        return (350*r + 2*18*r);
    }
    

}


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
public class Bus extends Vehicle{

    public Bus(){
        super(800, 1, 20);
    }

   public int finalScoreCalc(int r){
        return (800*r + 18*r);
    }
    

}


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
public class Car extends Vehicle {
    
    public Car(){
        super(400, 3, 4);
    }

    public int finalScoreCalc(int r){
        return (400*r + 3*18*r); 
    }
    
    
}

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
public abstract class Vehicle {
    
    
    public int CO2, efficiency, capacity, count;

    public Vehicle(int CO, int e, int c){
        this.CO2 = CO;
        this.efficiency = e;
        this.capacity = c;
    }

    public int getCO2(){return this.CO2;};
    public int getEfficiency(){return this.efficiency;}
    public int getCapacity(){return this.capacity;}
    public void setCount(int c){this.count = c;}

    public abstract int finalScoreCalc(int r);

    
}

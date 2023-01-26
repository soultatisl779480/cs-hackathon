

package hackathon;

import javax.swing.JOptionPane;


public class Hackathon extends frame{
     

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "The goal of this game is the transfer all the people from one location to the other but \nwith the most efficiency and the least CO2 emission" );
        JOptionPane.showMessageDialog(null, "These are two simple rules of the game: \n1. Player chooses ONE route for the people to be transfered from HOUSE to MARKET \n2. Player chooses ANY combination of vehicles in order to transfer all the people" );
        JOptionPane.showMessageDialog(null, "Good luck player!");
        
        frame f = new frame();
        f.setVisible(true);

        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle moto = new Motorcycle();
        

        JOptionPane.showMessageDialog(null, "Begin the game by choosing a route");

        
        int peopleLeft = f.getPeopleLeft();
        
        while (true){
            peopleLeft = f.getPeopleLeft();
            System.out.println(peopleLeft);
            if (peopleLeft <= 0){
                break;
            }
        }
        
        int totalCO2 = f.getCO2();
        int totalEfficiency = f.getTimeTaken();
        int totalRideCount = f.getRideCount();
        
        
        if ( (totalCO2 + totalEfficiency) < (car.finalScoreCalc(totalRideCount) + bus.finalScoreCalc(totalRideCount) + moto.finalScoreCalc(totalRideCount))/3){
            JOptionPane.showMessageDialog(null, "Congratulation, Your score was qualified as SUSTAINABLE!!!");
        }else {
            int v = (totalCO2 + totalEfficiency) - ((car.finalScoreCalc(totalRideCount) + bus.finalScoreCalc(totalRideCount) + moto.finalScoreCalc(totalRideCount))/3);
            JOptionPane.showMessageDialog(null, "Ooops, Your score was NOT qualified as SUSTAINABLE!!! \n You were " + v + " points away!");
        }
        System.out.println((totalCO2 + totalEfficiency));
        System.out.println((car.finalScoreCalc(totalRideCount) + bus.finalScoreCalc(totalRideCount) + moto.finalScoreCalc(totalRideCount))/3);
        
        
        
    }
    
    
    
    
    
    
}

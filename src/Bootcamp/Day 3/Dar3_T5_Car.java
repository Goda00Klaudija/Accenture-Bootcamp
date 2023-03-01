//Create a Car class which inherits from the Vehicle class.
package vehicles;

public class Dar3_T5_Car extends Dar3_T5_Vehicle{
    private double weight;

    public Dar3_T5_Car(){
        super();
        setWeight(weight);
    }

    public void setWeight(double weight){
        if(weight > 400){
            System.out.println("Too heavy for a car");
        }
        else{
            this.weight = weight;
        }
    }
}
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.

package vehicles;

//Create a base class of a Vehicle,


public class Dar3_T5_Vehicle {
    private double steeringAngle;
    private int gears;
    private int speed;


    public Dar3_T5_Vehicle(double steeringAngle, int gears, int speed){
        setSteeringAngle(steeringAngle);
        setGears(gears);
        setSpeed(speed);
    }

    public void setSteeringAngle(double SteeringAngle) {
        if(SteeringAngle < 45 || SteeringAngle > 45){
            System.out.println("Cannot steer more");
        }
        this.SteeringAngle = SteeringAngle;
        System.out.println(this.SteeringAngle);
    }
    public void setGears(int gears) {
        if( (1 <= gears) || (gears >= 5)){
            System.out.println("None existing gear number");
        }
        else {
            this.gears = gears;
            System.out.println(gears);
        }
    }

    public void setSpeed(int Speed) {
        if(Speed >= 482){
            System.out.println("Impossible speed");
        }
        else {
            this.Speed = Speed;
            System.out.println(Speed);
        }
    }
}
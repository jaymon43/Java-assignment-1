



public class Fan{
   
    private static final boolean False = false;
	public static int Slow = 1;
    public static int Medium = 2;
    public static int Fast = 3;
 
    private int speed = Slow;
    private boolean On= False;
    private String Color = "White";
    private double radius = 5; 
    public Fan() {
    }

    public void increaseSpeed(){
if (speed==Slow) 
speed = Medium;
 else if (speed == Medium)
speed = Fast;
System.out.println("Fan is running at highest speed");
    }

public void deacreaseSpeed(){
    if (speed==Fast)
    speed = Medium;
    else if (speed ==Medium)
    speed = Slow;
    System.out.println("Fan is running at lowest speed");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
  speed = newSpeed;
    }

    public boolean isOn() {
        return On;
    }

    public void TurnOn() {
        On = true;
    }
    public void TurnOff() {
        On = false;
    }

    public double getRadius() {
       
    return radius ;
    }

    public void setRaduis(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String newColor) {
        Color = newColor;
    }

    @Override
    public String toString() {
        return "speed" + speed + "\n" + "color" + Color + "\n" + "radius" + 
                radius + "\n";
        
}
}
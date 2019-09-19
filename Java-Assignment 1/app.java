public class app {
public static void main  (String []args){
    Fan fan1= new Fan();
    fan1.setSpeed(Fan.Fast);
    fan1.setRaduis(10);
        fan1.setColor("yellow");
        fan1.TurnOn();
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.Medium);
        fan2.setRaduis(5);
    fan2.setColor("blue");
   fan2.TurnOff();
    System.out.println(fan2.toString());

   }
}

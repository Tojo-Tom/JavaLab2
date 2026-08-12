/*
 * Task 3 - Emergency Rescue Robot
 * Demonstrates: Abstract class combined with interfaces, and a class
 * implementing multiple interfaces at once (multiple inheritance of type).
 */

// ---- Abstract class with common members, constructor and concrete methods ----
abstract class RescueRobot {
    protected String robotId;
    protected String name;

    public RescueRobot(String robotId, String name) {
        this.robotId = robotId;
        this.name = name;
    }

    // concrete method shared by every robot
    public void displayInfo() {
        System.out.println("Robot ID : " + robotId + " | Name : " + name);
    }

    // abstract method - every robot performs its mission differently
    public abstract void performMission();
}

// ---- Interfaces representing optional capabilities ----
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Climbable {
    void climb();
}

// ---- Robot 1: aerial rescue robot ----
class DroneRescueRobot extends RescueRobot implements Flyable {

    public DroneRescueRobot(String robotId, String name) {
        super(robotId, name);
    }

    @Override
    public void performMission() {
        System.out.println(name + ": Scanning disaster area from the air");
    }

    @Override
    public void fly() {
        System.out.println(name + ": Flying over the rescue zone");
    }
}

// ---- Robot 2: underwater rescue robot ----
class SubmarineRescueRobot extends RescueRobot implements Swimmable {

    public SubmarineRescueRobot(String robotId, String name) {
        super(robotId, name);
    }

    @Override
    public void performMission() {
        System.out.println(name + ": Searching for survivors underwater");
    }

    @Override
    public void swim() {
        System.out.println(name + ": Diving and swimming through flood water");
    }
}

// ---- Robot 3: rubble-climbing rescue robot ----
class ClimberRescueRobot extends RescueRobot implements Climbable {

    public ClimberRescueRobot(String robotId, String name) {
        super(robotId, name);
    }

    @Override
    public void performMission() {
        System.out.println(name + ": Navigating rubble to reach trapped survivors");
    }

    @Override
    public void climb() {
        System.out.println(name + ": Climbing over debris");
    }
}

// ---- Robot 4: amphibious robot combining ALL three interfaces ----
class AmphibiousRescueRobot extends RescueRobot implements Flyable, Swimmable, Climbable {

    public AmphibiousRescueRobot(String robotId, String name) {
        super(robotId, name);
    }

    @Override
    public void performMission() {
        System.out.println(name + ": Handling a multi-terrain rescue mission");
    }

    @Override
    public void fly() {
        System.out.println(name + ": Flying to reach the disaster site quickly");
    }

    @Override
    public void swim() {
        System.out.println(name + ": Swimming across flooded areas");
    }

    @Override
    public void climb() {
        System.out.println(name + ": Climbing collapsed structures");
    }
}

// ---- Driver class ----
public class Task3_EmergencyRescueRobot {
    public static void main(String[] args) {

        // array of abstract class references - polymorphic behaviour
        RescueRobot[] robots = new RescueRobot[4];
        robots[0] = new DroneRescueRobot("R-01", "SkyHawk");
        robots[1] = new SubmarineRescueRobot("R-02", "AquaDive");
        robots[2] = new ClimberRescueRobot("R-03", "RubbleCrawler");
        robots[3] = new AmphibiousRescueRobot("R-04", "TerraMax");

        for (RescueRobot robot : robots) {
            System.out.println("----------------------------------------");
            robot.displayInfo();       // concrete method from abstract class
            robot.performMission();    // abstract method -> overridden

            // interface references used only where the capability applies
            if (robot instanceof Flyable flyable) {
                flyable.fly();
            }
            if (robot instanceof Swimmable swimmable) {
                swimmable.swim();
            }
            if (robot instanceof Climbable climbable) {
                climbable.climb();
            }
        }
        System.out.println("----------------------------------------");
    }
}

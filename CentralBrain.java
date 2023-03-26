import java.util.ArrayList;
import java.util.List;

public class CentralBrain extends Robot implements CombiningRobot{
    List<Robot> robots = new ArrayList<>();
    int i =0;
    public CentralBrain(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }

    @Override
    public void combine(Robot robot) {
        if (i < 5) {
            robots.add(robot);
            robot.setPosition(getPosition());
            setHealth(getHealth() + robot.getHealth());
            setPower(getPower() + robot.getPower());
            i++;
        } else {
            System.out.println("robot besar sudah penuh");
        }
    }

    @Override
    public void separate(Robot robot) {
        robots.remove(robot);
        setHealth(getHealth() - robot.getHealth());
        setPower(getPower() - robot.getPower());
        i--;

    }

    public void getRobots() {
        for (Robot robot:robots) {
            System.out.println(robot.getName());
        }
    }
}

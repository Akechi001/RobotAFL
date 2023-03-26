import java.util.ArrayList;
import java.util.List;

public class CentralBrain extends Robot implements CombiningRobot{
    List<Robot> robots = new ArrayList<>();//membuat Arraylist robots
    int i =0;//deklarasi i

    //membuat super constructor yang dipanggil dari class RObot
    public CentralBrain(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }

    @Override
    public void combine(Robot robot) {//meng-override fungsi method dari implement CombiningRobot
        if (i < 5) {//mengecek kondisi i
            robots.add(robot);//menambah robot ke dalam arraylist
            robot.setPosition(getPosition());
            setHealth(getHealth() + robot.getHealth());
            setPower(getPower() + robot.getPower());//memberikan atribut-atribut pada robot terssebut
            i++;//menambah nilai i
        } else {//jika kondisi i terpenuhi
            System.out.println("robot besar sudah penuh");
        }
    }

    @Override
    public void separate(Robot robot) {//meng-override fungsi method dari implement CombiningRobot
        robots.remove(robot);//menghapus robot dari arraylist
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Support extends Robot {
    public Support(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }

    public void skill1(Robot robot){
        if(getUltimatepoint()>1){
            System.out.println("Dash digunakan");
            robot.setUltimatepoint(getUltimatepoint()-2);
            robot.setPosition(robot.getPosition()-3);
            System.out.println(getName()+"Sekarang robot berada di "+robot.getPosition());
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }

    public void skill2(Robot robot, List<Robot> allies){
        if(getUltimatepoint()>2){
            System.out.println("Healing digunakan");
            robot.setUltimatepoint(robot.getUltimatepoint()-3);
            System.out.print("Healing mau digunakan pada robot ke = ");
            int index = new Scanner(System.in).nextInt()-1;
            allies.get(index).setHealth(getMaxhealth());
            int heal = allies.get(index).getMaxhealth()-allies.get(index).getHealth();
            robot.setHealth(robot.getMaxhealth());
            System.out.println("Healing diberikan kepada "+allies.get(index).getName()+" dan memberikan "+heal+" health");
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }
}

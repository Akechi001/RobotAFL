import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Support extends Robot {
    public Support(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }

    public void skill1(){
        if(getUltimatepoint()>1){
            System.out.println(getName()+" Sekarang berada di "+getPosition());

            System.out.println("Dash digunakan");
            setUltimatepoint(getUltimatepoint()-2);
            setPosition(getPosition()-3);
            System.out.println(getName()+" Sekarang berada di "+getPosition());
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
            int heal = allies.get(index).getMaxhealth()-allies.get(index).getHealth();
            allies.get(index).setHealth(allies.get(index).getMaxhealth());
            robot.setHealth(robot.getMaxhealth());
            System.out.println("Healing diberikan kepada "+allies.get(index).getName()+" dan memberikan "+heal+" health");
            System.out.println("Health Excalibur saat ini = "+allies.get(index).getHealth());
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }
}

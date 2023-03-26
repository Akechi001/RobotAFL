import java.util.List;
import java.util.Scanner;

public class Support extends Robot {//class Support subclasses dari Robot

    //membuat super constructor yang dimana akan mengambil dari class Robot
    public Support(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }

    //skill pertama dari robot yang bernama Dash
    public void skill1(){
        if(getUltimatepoint()>1){//skill ini hanya bisa digunakan jika ultimate point dari suatu robot lebih dari 1
            System.out.println(getName()+" Sekarang berada di "+getPosition());

            System.out.println("Dash digunakan");
            setUltimatepoint(getUltimatepoint()-2);//mengurangi ultimate point pada robot tertentu
            setPosition(getPosition()-3);//mengurangi posisi robot
            System.out.println(getName()+" Sekarang berada di "+getPosition());//informasi posisi robot
        }else{//perintah ini tidak berjalan jika ultimatepoint tidak mencukupi
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }

    public void skill2(Robot robot, List<Robot> allies){
        if(getUltimatepoint()>2){//skill ini hanya bisa digunakan jika ultimate point dari suatu robot lebih dari 2
            System.out.println("Healing digunakan");
            robot.setUltimatepoint(robot.getUltimatepoint()-3);//mengurangi ultimate point pada robot tertentu
            System.out.print("Healing mau digunakan pada robot ke = ");
            int index = new Scanner(System.in).nextInt()-1;//menentukan robot mana yang mau di heal
            int heal = allies.get(index).getMaxhealth()-allies.get(index).getHealth();//menghitung berapa health yang mau di heal
            allies.get(index).setHealth(allies.get(index).getMaxhealth());//mengatur nyawa sampai full
            robot.setHealth(robot.getMaxhealth());
            System.out.println("Healing diberikan kepada "+allies.get(index).getName()+" dan memberikan "+heal+" health");
            System.out.println("Health Excalibur saat ini = "+allies.get(index).getHealth());//informasi nyawa
        }else{//perintah ini tidak berjalan jika ultimatepoint tidak mencukupi
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }
}

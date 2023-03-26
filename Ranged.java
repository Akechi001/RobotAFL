public class Ranged extends Robot {//class Ranged subclasses dari Robot

    //membuat super constructor yang dimana akan mengambil dari class Robot
    public Ranged(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }

    //skill pertama dari robot yang bernama Wind Shooter
    public void skill1(Robot robot, Monster monster){
        if(robot.getUltimatepoint()>1){//skill ini hanya bisa digunakan jika ultimate point dari suatu robot lebih dari 1
            System.out.println("Wind Shooter digunakan");
            robot.setUltimatepoint(getUltimatepoint()-2);//mengurangi ultimate point pada robot tertentu
            int damage=2*robot.getPower();//menghitung damage yang akan dihasilkan
            monster.setHealth(monster.getHealth()-damage);//mengatur nyawa monster dengan cara mengambil nyawa monster dan dikurangi dengan damage yang dihasilkan
            System.out.println("Wind Shooter memberikan "+damage+" Damage");
            System.out.println("nyawa monster menjadi "+monster.getHealth());//informasi nyawa dan damage
        }else{//perintah ini tidak berjalan jika ultimatepoint tidak mencukupi
            System.out.println("Ultimate point belum cukup. your ultimate point = "+robot.getUltimatepoint());
        }
    }

    public void skill2(Robot robot,Monster monster){
        if(robot.getUltimatepoint()>2){//skill ini hanya bisa digunakan jika ultimate point dari suatu robot lebih dari 2
            System.out.println("Heavy Bullet digunakan");
            robot.setUltimatepoint(robot.getUltimatepoint()-3);//mengurangi ultimate point pada robot tertentu
            int damage=3*robot.getPower();//menghitung damage yang akan dihasilkan
            monster.setHealth(monster.getHealth()-damage);//mengatur nyawa monster dengan cara mengambil nyawa monster dan dikurangi dengan damage yang dihasilkan
            System.out.println("Heavy Bullet memberikan "+damage+" Damage");
            System.out.println("nyawa monster menjadi "+monster.getHealth());//informasi nyawa dan damage
        }else{//perintah ini tidak berjalan jika ultimatepoint tidak mencukupi
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }


    public void skillultimate(Robot robot, Monster monster){
        if(robot.getUltimatepoint()==5){//skill ini hanya bisa digunakan jika ultimate point dari suatu robot bernilai sama dengan 5
            System.out.println("Nuclear Power digunakan");
            robot.setUltimatepoint(robot.getUltimatepoint()-5);//mengurangi ultimate point pada robot tertentu
            int damage=5*robot.getPower();//menghitung damage yang akan dihasilkan
            monster.setHealth(monster.getHealth()-damage);//mengatur nyawa monster dengan cara mengambil nyawa monster dan dikurangi dengan damage yang dihasilkan
            System.out.println("Nuclear Power dari "+robot.getName()+" memberikan "+damage+" Damage");
            System.out.println("nyawa monster menjadi "+monster.getHealth());//informasi nyawa dan damage
        }else{//perintah ini tidak berjalan jika ultimatepoint tidak mencukupi
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }
}

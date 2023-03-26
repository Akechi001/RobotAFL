public class Ranged extends Robot {

    public Ranged(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }


    public void skill1(Robot robot, Monster monster){
        if(robot.getUltimatepoint()>1){
            System.out.println("Wind Shooter digunakan");
            robot.setUltimatepoint(getUltimatepoint()-2);
            int damage=2*robot.getPower();
            monster.setHealth(monster.getHealth()-damage);
            System.out.println("Wind Shooter memberikan "+damage+" Damage");
            System.out.println("nyawa monster menjadi "+monster.getHealth());
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+robot.getUltimatepoint());
        }
    }

    public void skill2(Robot robot,Monster monster){
        if(robot.getUltimatepoint()>2){
            System.out.println("Heavy Bullet digunakan");
            robot.setUltimatepoint(robot.getUltimatepoint()-3);
            int damage=3*robot.getPower();
            monster.setHealth(monster.getHealth()-damage);
            System.out.println("Heavy Bullet memberikan "+damage+" Damage");
            System.out.println("nyawa monster menjadi "+monster.getHealth());
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }


    public void skillultimate(Robot robot, Monster monster){
        if(robot.getUltimatepoint()==5){
            System.out.println("Nuclear Power digunakan");
            robot.setUltimatepoint(robot.getUltimatepoint()-5);
            int damage=5*robot.getPower();
            monster.setHealth(monster.getHealth()-damage);
            System.out.println("Nuclear Power dari "+robot.getName()+" memberikan "+damage+" Damage");
            System.out.println("nyawa monster menjadi "+monster.getHealth());
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }
}

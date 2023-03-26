public class Ranged extends Robot {

    public Ranged(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }


    public void skill1(){
        if(getUltimatepoint()>1){
            System.out.println("Wind Shooter digunakan");
            setUltimatepoint(ultimatepoint-=2);
            power*=2;
            setPower(power);
            System.out.println("Wind Shooter memberikan "+power+" Damage");
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }

    public void skill2(Robot robot){
        if(getUltimatepoint()>2){
            System.out.println("Healing digunakan");
            setUltimatepoint(ultimatepoint-=3);
            robot.setHealth(getMaxhealth());
            System.out.println("Heavy Bullet memberikan "+getMaxhealth()+" Damage");
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }


    public void skillultimate(){
        if(getUltimatepoint()==5){
            System.out.println("Nuclear Power digunakan");
            setUltimatepoint(ultimatepoint-=5);
            power*=5;
            setPower(power);
            System.out.println("Nuclear Power dari "+getName()+" memberikan "+power+" Damage");
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }
}

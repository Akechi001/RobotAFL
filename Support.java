public class Support extends Robot {
    public Support(String name, String type, int health, int maxhealth, int power, int position) {
        super(name, type, health, maxhealth, power, position);
    }

    public void skill1(){
        if(getUltimatepoint()>1){
            System.out.println("Dash digunakan");
            setUltimatepoint(ultimatepoint-=2);
            position-=3;
            setPosition(getPosition()-3);
            System.out.println(getName()+" Melarikan diri sebanyak "+position+" langkah");
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }

    public void skill2(){
        if(getUltimatepoint()>2){
            System.out.println("Triple Slash digunakan");
            setUltimatepoint(ultimatepoint-=3);
            power*=3;
            setPower(power);
            System.out.println("Triple Slash memberikan "+power+" Damage");
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }


    public void skillultimate(){
        if(getUltimatepoint()==5){
            System.out.println("Hidden Legend Excalibur skill digunakan");
            setUltimatepoint(ultimatepoint-=5);
            power*=5;
            setPower(power);
            System.out.println("Hidden Legend Excalibur skill dari "+getName()+" memberikan "+power+" Damage");
        }else{
            System.out.println("Ultimate point belum cukup. your ultimate point = "+getUltimatepoint());
        }
    }
}

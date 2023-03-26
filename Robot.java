public abstract class Robot {
    private String name, type;
    int health, maxhealth, power, position, maxrange, ultimatepoint;


    public Robot(String name, String type, int health, int maxhealth, int power, int position) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.maxhealth = maxhealth;
        this.power = power;
        this.position = position;
    }
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMaxrange() {
        return maxrange;
    }

    public void setMaxrange(int maxrange) {
        this.maxrange = maxrange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getUltimatepoint() {
        return ultimatepoint;
    }

    public void setUltimatepoint(int ultimatepoint) {
        this.ultimatepoint = ultimatepoint;
    }

    public void move(){}
    public void attack(){
        if (ultimatepoint <= 4) {
            setUltimatepoint(ultimatepoint+=1);
            System.out.println("robot "+getName()+" memberikan "+getPower()+" damage.");
        }else{
            System.out.println("robot "+getName()+" memberikan "+getPower()+" damage.");
        }
    }
    public void defend(){}
    public void heal(){}

}

public abstract class Robot {//robot merupakan class abstract
    //deklarasi variables
    private String name, type;
    int health, maxhealth, power, position, maxrange, ultimatepoint;
    boolean defend = true;

    //create constructor for variables
    public Robot(String name, String type, int health, int maxhealth, int power, int position) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.maxhealth = maxhealth;
        this.power = power;
        this.position = position;
    }

    //make a getter and setter for some variables
    public boolean isDefend() {
        return defend;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setMaxrange(int maxrange) {
        this.maxrange = maxrange;
    }

    public String getName() {
        return name;
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

    //normal attack for All robots
    public void attack(Monster monster) {
        if (monster.getHealth() <= 0) {//mengecek kondisi jika nyawa monster masih ada atau tidak
            System.out.println("Monster sudah mati");
        } else {
            if (ultimatepoint <= 4) {//mengecek jika ultimatepoint kurang atau sama dengan 4
                setUltimatepoint(ultimatepoint += 1);//ultimatepoint bertambah tiap menggunakan normal attack
                System.out.println("robot " + getName() + " memberikan " + getPower() + " damage.");
                System.out.print("nyawa monster berkurang dari " + monster.getHealth());
                monster.setHealth(monster.getHealth() - power);//mengatur nyawa monster yang dikurangi dengan power dari robot
                System.out.print(" menjadi " + monster.getHealth() + "\n");
            } else {// jika ultimatepoint mencapai batas, maka akan menmberikan damage dan tidak menambah ultimatepoint
                System.out.println("robot " + getName() + " memberikan " + getPower() + " damage.");
                System.out.print("nyawa monster berkurang dari " + monster.getHealth());
                monster.setHealth(monster.getHealth() - power);//mengatur nyawa monster yang dikurangi dengan power dari robot
                System.out.print(" menjadi " + monster.getHealth() + "\n");
            }
        }
    }

}

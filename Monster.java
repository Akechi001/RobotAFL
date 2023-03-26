public class Monster {
    //deklarasi variables
    int health =2000;
    int power = 100;
    int position = 0;


    //attack untuk monster
    public void attack(Robot robot) {
        if (health >= 0) {//mengecek kondisi
            if (robot.getPosition() == position) {
                    System.out.print("\nnyawa robot dari " + robot.getHealth());
                    if (!robot.isDefend()) {
                        robot.setHealth(robot.getHealth() - (power / 2));
                    } else {
                        robot.setHealth(robot.getHealth() - power);
                    }
                    System.out.print(" berkurang menjadi " + robot.getHealth() + "\n");
                }else{

            }
            } else{

            System.out.println("monster sudah mati");}
    }

    //setter dan getter some variables

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPosition() {
        return position;
    }

}

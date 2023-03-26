public class Monster {
    int health =2000;
    int power = 100;
    int position = 0;

    public void attack(Robot robot) {
        if (health >= 0) {
            if (robot.getPosition() == position) {
                    System.out.print("\nnyawa robot dari " + robot.getHealth());
                    if (!robot.isDefend()) {
                        robot.setHealth(robot.getHealth() - (power / 2));
                    } else {
                        robot.setHealth(robot.getHealth() - power);
                    }
                    System.out.print(" berkurang menjadi " + robot.getHealth() + "\n");
                }else{
                System.out.println("TIDAK ADA");
            }
            } else{

            System.out.println("monster sudah mati");}
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }



    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

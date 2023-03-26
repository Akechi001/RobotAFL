import java.util.ArrayList;
import java.util.Scanner;

public class Pilot {
    private static ArrayList<Robot> allies = new ArrayList<>();
    private CentralBrain largeRobot;
    private Robot robot;
    static Meele Excalibur = new Meele("Excalibur", "sword", 2000, 2000, 100, 1);
    static Ranged Sniper = new Ranged("Sniper", "Long-Ranged", 1000, 1000, 50, 2);
    static Support Angel = new Support("Angel", "Healer", 1000, 3000,50,3);
    static Meele Phoenix = new Meele("Phoenix", "mjolnir", 2400, 2400, 150, 4);
    static Support Megawatron = new Support("Megawatron","Buff", 2000,1000,50,5);


    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb =new StringBuilder();
        Pilot pilot = new Pilot();
        pilot.listrobot();
        pilot.menu();
    }

    public void listrobot(){
        allies.add(Excalibur);
        allies.add(Sniper);
        allies.add(Angel);
        allies.add(Phoenix);
        allies.add(Megawatron);
    }
    public void menu() throws InterruptedException {
        System.out.println("Pick the Robot you want to battle");
        System.out.println("============================");
        System.out.println("1. Excalibur");
        System.out.println("2. Sniper");
        System.out.println("3. Angel");
        System.out.println("4. Phoenix");
        System.out.println("5. Megawatran");
        if (largeRobot == null) {
            System.out.println("6. Combine Robot");
        } else {
            System.out.println("6. Seperate Robot");
        }
        System.out.println("7. Exit\n");
        System.out.print("Pilih Robot: ");
        int tindakan = new Scanner(System.in).nextInt();
        switch (tindakan) {
            case 1, 2,3,4,5:
                menu2();   // panggil menu battle
                break;
            // panggil menu status
            case 6:
                if (largeRobot == null) {
                    combineRobot();     // panggil method CombineRobot
                    menu2();
                } else {
                    seperateRobot();    // panggil method SeperateRobot
                    menu2();
                }
                break;
            case 7:
                System.out.println("\n!!! THANK YOU FOR PLAYING !!!");
                return;
            default:
                System.out.println("\n!!! Pilihan tidak valid, silahkan coba lagi !!!\n");
        }
        Thread.sleep(3000); // tambahkan delay biar gak terlalu spam
    }

    private void seperateRobot() {
        largeRobot.separate();
        System.out.println("\n!!! Robot telah terbongkar !!!\n");
    }

    private void combineRobot() {
        largeRobot = new CentralBrain("ANDRAS", "TITAN", 50000, 2000,1000,7);
        largeRobot.combine();
        System.out.println("\n!!! Robot telah bergabung menjadi satu !!!\n");
    }



    public void menu2(){
        System.out.println("Pick What Action you want");
        System.out.println("1. Normal Attack");
        System.out.println("2. Defend");
        System.out.println("3. Skill 1");
        System.out.println("4. Skill 2");
        System.out.println("5. Ultimate");
        System.out.print("Pilih tindakan: ");
        int tindakan = new Scanner(System.in).nextInt();
        switch (tindakan) {
            case 1:
                robot.attack();
        }
        }

    }



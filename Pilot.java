import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pilot {
    public static void main(String[] args) {

        List<Robot> allies = new ArrayList<>();
        List<Monster> monsters = new ArrayList<>();
        CentralBrain centralBrain;

        allies.add(new Meele("Excalibur", "sword", 2000, 2000, 100, 0));
        allies.add(new Ranged("Sniper", "Long-Ranged", 1000, 1000, 50, 2));
        allies.add(new Support("Angel", "Healer", 1000, 3000, 50, 3));
        allies.add(new Meele("Phoenix", "mjolnir", 2400, 2400, 150, 4));
        allies.add(new Support("Megawatron", "Buff", 2000, 1000, 50, 5));

        monsters.add(new Monster());
        monsters.add(new Monster());
        monsters.add(new Monster());
        monsters.add(new Monster());


        //mengecek attack dan skil untuk robot meele (robot Excalibur) jika berada di posisi yg sama
        if (allies.get(0) instanceof Meele) {// mengecek apakah robot dengan index 0 termasuk dalam bagian class Meele
            System.out.println("Percobaan position sama");
            for(int i=0;i<=4;i++) {
                allies.get(0).attack(monsters.get(0));//robot dengan index 0 menyerang monster index 0
                System.out.println();
            }
            ((Meele) allies.get(0)).skill1(allies.get(0), monsters.get(0));// deklarasi class Meele dan robot dengan index 0 menyerang monster index 0 menggunakan skill1
            System.out.println();
            ((Meele) allies.get(0)).skill2(allies.get(0), monsters.get(0));
            System.out.println();
            ((Meele) allies.get(0)).skillultimate(allies.get(0), monsters.get(0));
        }
        //robot dan monster berbeda tempat
        if(allies.get(0) instanceof Meele){// mengecek apakah robot dengan index 0 termasuk dalam bagian class Meele
            System.out.println("percobaan Position berbeda dengan monster");
            System.out.println();
            allies.get(0).setPosition(2);//mengubah posisi robot menjadi beda 2 petak
            System.out.println();
            allies.get(0).attack(monsters.get(0));
            System.out.println();
            ((Meele) allies.get(0)).skill1(allies.get(0), monsters.get(0));
            System.out.println();

        }

        //mengecek robot kedua (Sniper) (Ranged)
        if(allies.get(1) instanceof Ranged){
            System.out.println("percobaan robot Ranged");
            for(int i=0;i<=4;i++) {
                allies.get(1).attack(monsters.get(0));//robot dengan index 1 pada list menyerang monster index 0
                System.out.println();
            }
            ((Ranged) allies.get(1)).skill1(allies.get(1), monsters.get(0));// deklarasi class Meele dan robot dengan index 0 menyerang monster index 0 menggunakan skill1
            System.out.println();
            ((Ranged) allies.get(1)).skill2(allies.get(1), monsters.get(0));
            System.out.println();
            ((Ranged) allies.get(1)).skillultimate(allies.get(1), monsters.get(0));
        }
        //Mengecek robot ketiga (Angel) (Support)
        if(allies.get(2) instanceof Support){//robot dengan index 2 pada list akan

            for(int i=0;i<=4;i++){
            allies.get(2).attack(monsters.get(0));//robot dengan index 1 pada list menyerang monster index 0
            System.out.println();
            }
            ((Support) allies.get(2)).skill1();// deklarasi class Meele dan robot dengan index 0 menyerang monster index 0 menggunakan skill1
            System.out.println();
            allies.get(0).setPosition(0);
            for(int i=0;i<=10;i++){
            monsters.get(0).attack(allies.get(0));
            System.out.println();
            }
            System.out.println(allies.get(0).getHealth());
            ((Support) allies.get(2)).skill2(allies.get(2),allies);
            System.out.println();
        }
    }
    }



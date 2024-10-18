package Mastermind;
import java.util.*;
import java.lang.Math;

public class MasterMind {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Hier geeft ik de Variables namen
        int nummer;

        nummer = 0;
        String[] kleur = new String[7];

        kleur[0] = "rood";
        kleur[1] = "blauw";
        kleur[2] = "oranje";
        kleur[3] = "geel";
        kleur[4] = "paars";
        kleur[5] = "groen";
        kleur[6] = "geen";
        String[] code = new String[4];

        while (nummer != 4) {
            code[nummer] = kleur[6];
            nummer = nummer + 1;
        }
        int codeNum;

        codeNum = 0;
        nummer = 0;

        // Code generator 3000
        while (codeNum != 4) {
            nummer = random.nextInt(6);
            code[codeNum] = kleur[nummer];
            codeNum = codeNum + 1;
        }

        // Variablen van de Ant
        String ant1;

        ant1 = kleur[6];
        String ant2;

        ant2 = kleur[6];
        String ant3;

        ant3 = kleur[6];
        String ant4;

        ant4 = kleur[6];

        // Variablen voor de Rondes
        int ronde;

        ronde = 1;

        // Begin van het Spel
        while (ronde != 11) {
            if (ant1.equals(code[0]) && ant2.equals(code[1]) && ant3.equals(code[2]) && ant4.equals(code[3])) {
                ronde = 11;
            } else {
                System.out.println("Ronde: " + ronde);
                System.out.println("Raad de Code");
                System.out.println("Kies uit: rood, geel, blauw, paars, oranje, groen");
                ant1 = input.nextLine();
                ant2 = input.nextLine();
                ant3 = input.nextLine();
                ant4 = input.nextLine();
                if (ant1.equals(code[0])) {
                    System.out.println("Rij 1 is Zwart");
                } else {
                    if (ant1.equals(code[1]) || ant1.equals(code[2]) || ant1.equals(code[3])) {
                        System.out.println("Rij 1 is Wit");
                    } else {
                        System.out.println("Rij 1 is Leeg");
                    }
                }
                if (ant2.equals(code[1])) {
                    System.out.println("Rij 2 is Zwart");
                } else {
                    if (ant2.equals(code[0]) || ant2.equals(code[2]) || ant2.equals(code[3])) {
                        System.out.println("Rij 2 is Wit");
                    } else {
                        System.out.println("Rij 2 is Leeg");
                    }
                }
                if (ant3.equals(code[2])) {
                    System.out.println("Rij 3 is Zwart");
                } else {
                    if (ant3.equals(code[0]) || ant3.equals(code[1]) || ant3.equals(code[3])) {
                        System.out.println("Rij 3 is Wit");
                    } else {
                        System.out.println("Rij 3 is Leeg");
                    }
                }
                if (ant4.equals(code[3])) {
                    System.out.println("Rij 4 is Zwart");
                } else {
                    if (ant4.equals(code[0]) || ant4.equals(code[1]) || ant4.equals(code[2])) {
                        System.out.println("Rij 4 is Wit");
                    } else {
                        System.out.println("Rij 4 is Leeg");
                    }
                }
            }
            ronde = ronde + 1;
        }
        if (ant1.equals(code[0]) && ant2.equals(code[1]) && ant3.equals(code[2]) && ant4.equals(code[3])) {
            System.out.println("Goed Gedaan jij hebt de Code geraden");
        } else {
            System.out.println("Helaas Jij hebt de Code niet geraden");
        }
    }
}

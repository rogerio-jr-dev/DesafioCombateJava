package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Champion a, b;

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name = sc.next();
        System.out.print("Vida inicial: ");
        int initialLife = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        sc.nextLine();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        a = new Champion(name, initialLife, attack, armor);
        System.out.println();
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        name = sc.next();
        System.out.print("Vida inicial: ");
        initialLife = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        sc.nextLine();
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        b = new Champion(name, initialLife, attack, armor);
        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Resultado do turno %d:\n", i);
            a.takeDamage(a.getLife(), b.getAttack(), a.getArmor());
            b.takeDamage(b.getLife(), a.getAttack(), b.getArmor());

            if (a.getLife() <= 0) {
                a.setLife(0);
                System.out.print(a.status());
                System.out.println(" (morreu)");
                System.out.println(b.status());
                i = n;
            } else if (b.getLife() <= 0) {
                b.setLife(0);
                System.out.print(b.status());
                System.out.println("(morreu)");
                System.out.println(a.status());
                i = n;
            } else {
                System.out.println(a.status());
                System.out.println(b.status());
            }
            System.out.println();
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}

package Program1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = new Person("Levi", 19);
        System.out.println(p);

        p.fazAniversario();

        sc.close();
    }
}
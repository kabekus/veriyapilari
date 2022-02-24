package LinkedList;

import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        ListStruct object = new ListStruct();
        for (int i = 1 ; i<=3 ; i++){
            System.out.println("Lütfen bir sayı girin !");
            int obj= scan.nextInt();
            object.added(obj);
        }
        System.out.print("\n****************");
        object.knotList();

    }
}

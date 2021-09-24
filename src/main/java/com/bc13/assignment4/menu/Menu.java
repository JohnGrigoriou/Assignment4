package com.bc13.assignment4.menu;

import com.bc13.assignment4.models.TShirt;
import com.bc13.assignment4.utils.Generator;
import com.bc13.assignment4.utils.Style;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void menu() {
        Style.print(Style.PURPLE,"_________________________WELCOME TO OUR E-SHOP__________________________\n\n\n");
        Scanner sc = new Scanner(System.in); 
        Generator generator = new Generator();
        List<TShirt> allTShirts = generator.generateTShirts(40);
        Style.line();
        while (true) {
        MenuUtils.menuOptions();
            Style.println(Style.YELLOW, "TYPE ONE OF THE MENU'S CHOICES TO CONTINUE...");
            String str = sc.nextLine();
            String choice = str.trim().toUpperCase();
            switch (choice) {
                case "1":
                    MenuUtils.sortBySizeAsc(allTShirts);
                    break;
                case "2":
                    MenuUtils.sortBySizeDesc(allTShirts);
                    break;
                case "3":
                    MenuUtils.sortByColorAsc(allTShirts);
                    break;
                case "4":
                    MenuUtils.sortByColorDesc(allTShirts);
                    break;
                case "5":
                    MenuUtils.sortByFabricAsc(allTShirts);
                    break;
                case "6":
                    MenuUtils.sortByFabricDesc(allTShirts);
                    break;
                case "7":
                    MenuUtils.sortBySizeColorFabricAsc(allTShirts);
                    break;
                case "8":
                    MenuUtils.sortBySizeColorFabricDesc(allTShirts);
                    break;
                case "MENU":
                    MenuUtils.menuOptions(); 
                    break;
                case "EXIT":
                    MenuUtils.exit();
                default:
                    Style.println(Style.RED,"WRONG INPUT!!!\n");
                    break;
            }
        }
    }
    
}

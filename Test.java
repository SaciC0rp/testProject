package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffe = 120;
        int disposibleCups = 9;
        int money = 550;

        String userInput;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            userInput = scanner.next();
            switch (userInput) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String buyInput = scanner.next();
                    if("back".equals(buyInput)){
                        break;
                    }else {
                    switch (buyInput) {
                        case "1":
                            if(water >= 250 && coffe >= 16 && disposibleCups >= 1) {
                                water -= 250;
                                coffe -= 16;
                                money += 4;
                                disposibleCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            }else {
                                if(water < 250){
                                    System.out.println("Sorry, not enough water!");
                                }else if(coffe < 16){
                                    System.out.println("Sorry, not enough coffee!");
                                }else {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                        case "2":
                            if(water >= 350 && milk >=75 && coffe >= 20 && disposibleCups >= 1) {
                                water -= 350;
                                coffe -= 20;
                                milk -= 75;
                                money += 7;
                                disposibleCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            }else {
                                if(water < 350){
                                    System.out.println("Sorry, not enough water!");
                                }else if(coffe < 20){
                                    System.out.println("Sorry, not enough coffee!");
                                } else if (milk < 75) {
                                    System.out.println("Sorry, not enough milk");
                                } else {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                        case "3":
                            if(water >= 200 && milk >= 100 && coffe >= 12 && disposibleCups >= 1) {
                                water -= 200;
                                coffe -= 12;
                                milk -= 100;
                                money += 6;
                                disposibleCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            }else {
                                if(water < 200){
                                    System.out.println("Sorry, not enough water!");
                                }else if(coffe < 12){
                                    System.out.println("Sorry, not enough coffee!");
                                } else if (milk < 100) {
                                    System.out.println("Sorry, not enough milk");
                                } else {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                    }
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    int workerWater = scanner.nextInt();
                    water += workerWater;
                    System.out.println("Write how many ml of milk you want to add: ");
                    int workerMilk = scanner.nextInt();
                    milk += workerMilk;
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int workerCoffe = scanner.nextInt();
                    coffe += workerCoffe;
                    System.out.println("Write how many disposable cups you want to add: ");
                    int workerCups = scanner.nextInt();
                    disposibleCups += workerCups;
                    break;
                case "take":
                    System.out.printf("I gave you $%d", money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d ml of water\n", water);
                    System.out.printf("%d ml of milk\n", milk);
                    System.out.printf("%d g of coffee beans\n", coffe);
                    System.out.printf("%d disposable cups\n", disposibleCups);
                    System.out.printf("$%d of money\n", money);
                    break;
            }
        }while(!"exit".equals(userInput));



    }

}

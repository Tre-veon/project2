import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String>tasks = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all task.");
        System.out.println("(0) Exit.");

        int userInput = input.nextInt();
        if (userInput == 1){
            addTask();
        }

    }
    private  static void addTask(){
        System.out.println("Enter your new task");
        String task = input.nextLine();


    }


}
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Treveon Aponte
//Feb 5


public class Main {
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        //Creates the menu to pick from
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all task.");
        System.out.println("(0) Exit.");

        int userInput = input.nextInt();
        input.nextLine();
        //while loop that allows the user to continue to choose options.
        while (true) {
            if (userInput == 1) {
                addTask(tasks);
            } else if (userInput == 0) {
                System.exit(0);
            } else if (userInput == 2) {
                removeTask(tasks);
            } else if (userInput == 4) {
                listTask(tasks);
            }else if (userInput == 3){
                updateTask(tasks);

            }


            System.out.println("Please make another selection");
            userInput = input.nextInt();
            input.nextLine();
        }
    }
    //All the following code are the functions for the menu to work. Like to add tasks, delete tasks, change tasks, list tasks and to close it.
    private  static ArrayList<String> addTask(ArrayList<String> tasks){
        System.out.println("Enter your new task");
        String task = input.nextLine();
        tasks.add(task);
        return tasks;
    }

     static ArrayList<String> removeTask(ArrayList<String> tasks){
        System.out.println("Enter the task to remove");
        String rem = input.nextLine();
        tasks.remove(rem);
        return tasks;
    }

     static void listTask(ArrayList<String>tasks){
        System.out.println(tasks);
    }

    static ArrayList<String> updateTask(ArrayList<String> tasks){
        System.out.println("What index would you like to replace?");
        int ind = input.nextInt();
        input.nextLine();
        System.out.println("What would you like to add?");
        String change = input.nextLine();
        tasks.set(ind, change);
        return tasks;

    }


}
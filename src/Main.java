import java.util.ArrayList;
import java.util.Scanner;

//Treveon Aponte
//Feb 5


public class Main {
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        //Creates the menu to pick from
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all task.");
        System.out.println("(5) List by priority");
        System.out.println("(0) Exit.");
        try {
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
                } else if (userInput == 3) {
                    updateTask(tasks);

                }else if (userInput == 5){
                    prioCheck(tasks);
                }


                System.out.println("Please make another selection");
                userInput = input.nextInt();
                input.nextLine();
            }}
        catch(Exception e){
                System.out.println("something went wrong");
            }


    }
    //All the following code are the functions for the menu to work. Like to add tasks, delete tasks, change tasks, list tasks and to close it.
    private  static ArrayList<Task> addTask(ArrayList<Task> tasks){

        System.out.println("Please enter a title for your new task");
        String title = input.nextLine();

        System.out.println("Please enter a description of the task");
        String desc = input.nextLine();

        System.out.println("Please enter a priority for the task");
        int prio = input.nextInt();
        input.nextLine();

        Task aNewTask = new Task(title,desc,prio);


        tasks.add(aNewTask);
        return tasks;
    }

     static ArrayList<Task> removeTask(ArrayList<Task> tasks){
        System.out.println("Enter the task to remove");
        String rem = input.nextLine();
        tasks.remove(Integer.parseInt(rem));
        return tasks;
    }

     static void listTask(ArrayList<Task>tasks){
        System.out.println(tasks);
    }

    static ArrayList<Task> updateTask(ArrayList<Task> tasks){
        System.out.println("What index would you like to replace?");
        int ind = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a title for your new task");
        String title = input.nextLine();

        System.out.println("Please enter a description of the task");
        String desc = input.nextLine();

        System.out.println("Please enter a priority for the task");
        int prio = input.nextInt();
        input.nextLine();

        Task aNewTask = new Task(title,desc,prio);
        tasks.set(ind,aNewTask);
        return tasks;

    }
    static ArrayList<Task> prioCheck(ArrayList<Task>tasks){
        System.out.println("What priority would you like me to find?");
        for(Task item:tasks){
            int userInput = input.nextInt();
            int prio = item.getPriority();
            if(prio == userInput){
                System.out.println(item);
            }
        }



        return tasks;
    }


}
class Task{
    private String title;

    private String desc;

    private int priority;

    public Task(String title, String desc, int priority) {
        this.title = title;
        this.desc = desc;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
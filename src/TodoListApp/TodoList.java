package TodoListApp;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
  
  private static ArrayList<String> tasks = new ArrayList<>();
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    while (true) {
      System.out.println("Todo List");
      System.out.println("1. Add a task");
      System.out.println("2. Edit a task");
      System.out.println("3. Delete a task");
      System.out.println("4. View all tasks");
      System.out.println("5. Exit");
      
      System.out.print("Enter a choice: ");
      int choice = input.nextInt();
      
      switch (choice) {
        case 1:
          addTask();
          break;
        case 2:
          editTask();
          break;
        case 3:
          deleteTask();
          break;
        case 4:
          viewTasks();
          break;
        case 5:
          System.out.println("Exiting...");
          System.exit(0);
        default:
          System.out.println("Invalid choice. Try again.");
      }
    }
  }
  
  private static void addTask() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a task: ");
    String task = input.nextLine();
    tasks.add(task);
    System.out.println("Task added.");
  }
  
  private static void editTask() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter task number to edit: ");
    int taskNumber = input.nextInt();
    taskNumber -= 1;
    
    if (taskNumber >= 0 && taskNumber < tasks.size()) {
      System.out.print("Enter new task: ");
      input.nextLine();
      String task = input.nextLine();
      tasks.set(taskNumber, task);
      System.out.println("Task edited.");
    } else {
      System.out.println("Invalid task number.");
    }
  }
  
  private static void deleteTask() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter task number to delete: ");
    int taskNumber = input.nextInt();
    taskNumber -= 1;
    
    if (taskNumber >= 0 && taskNumber < tasks.size()) {
      tasks.remove(taskNumber);
      System.out.println("Task deleted.");
    } else {
      System.out.println("Invalid task number.");
    }
  }
  
  private static void viewTasks() {
    if (tasks.isEmpty()) {
      System.out.println("No tasks.");
    } else {
      System.out.println("Tasks:");
      for (int i = 0; i < tasks.size(); i++) {
        System.out.println((i + 1) + ". " + tasks);
        		
      }
      }
        		
  }		
        		
}		
        		

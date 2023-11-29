package task2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TaskSchedular 
{
	private List<Task> tasks;
	Scanner sc=new Scanner(System.in);

	public TaskSchedular() 
	{
		super();
		tasks = new ArrayList<>();
	}
	
	public void run()
	{
		int choice;
		
		do
		{
			System.out.println("Welcome to Task Schedular App");
			System.out.println("1.Add Task");
			System.out.println("2.View Task");
			System.out.println("3.Exit from App");
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
			{
				addTask();
				break;
			}
			case 2:
			{
				viewTask();
				break;
			}	
			case 3:
			{
				System.out.println("Exiting from Task Schedular App.");
				break;
			}	
			default:
				System.out.println("Invalid Choice..");
			}
			notifications();
			System.out.println();
		}while(choice!=3);
	}
	
	public void addTask()
	{
		System.out.println("Enter Task Name : ");
		String taskName=sc.next();
		
		LocalDateTime dueDate = getDateFromUser();
		
		System.out.println("Highest Priority=1 from to Lowest Priority=10");
		System.out.println("Enter Priority level of Task in Numbers (1-10) : ");
		int priority=sc.nextInt();
		
		Task newTask=new Task(taskName, dueDate, priority);
		
		tasks.add(newTask);
		System.out.println("Task Added Successfully");
	}

	public void viewTask()
	{
		if(tasks.isEmpty())
		{
			System.out.println("No Task Available/Found.");
		}
		else
		{
			Iterator<Task> i=tasks.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
	}

	private LocalDateTime getDateFromUser() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Tasks Due Date in digits :  ");
		//year
		int year;
		System.out.println("Enter year in number");
		while (!sc.hasNextInt()) 
		 {
               System.out.println("Invalid input. Please enter year in number only.");
               sc.next(); 
         }
		year=sc.nextInt();
		//month
		int month;
		System.out.println("Enter Month in number");
		while (!sc.hasNextInt()) 
		 {
              System.out.println("Invalid input. Please enter month in number only.");
              sc.next(); 
        }
		month=sc.nextInt();
		//day
		int date;
		System.out.println("Enter Day in number");
		while (!sc.hasNextInt()) 
		 {
             System.out.println("Invalid input. Please enter day in number only.");
             sc.next(); 
		 }
		date=sc.nextInt();
		//hours
		int hrs;
		System.out.println("Enter Hours in number");
		while (!sc.hasNextInt()) 
		 {
             System.out.println("Invalid input. Please enter hours in number only.");
             sc.next(); 
		 }
		hrs=sc.nextInt();
		//minutes
		int min;
		System.out.println("Enter Minutes in number");
		while (!sc.hasNextInt()) 
		 {
             System.out.println("Invalid input. Please enter Minutes in number only.");
             sc.next(); 
		 }
		min=sc.nextInt();
		//seconds
		int sec;
		System.out.println("Enter Seconds in number");
		while (!sc.hasNextInt()) 
		 {
             System.out.println("Invalid input. Please enter Seconds in number only.");
             sc.next(); 
		 }
		sec=sc.nextInt();
		
		return LocalDateTime.of(year, month, date, hrs, min, sec);
	}
	
	private void notifications()
	{
		LocalDateTime currentDateTime=LocalDateTime.now();
		
		for (Task task : tasks) 
		{
			if(task.getDueDate().isBefore(currentDateTime))
			{
				System.out.println("Notification : "+task.getTaskName()+"'s is overdue!");
			}
			
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TaskSchedular app=new TaskSchedular();
		app.run();

	}

}

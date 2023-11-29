package task2;

import java.time.LocalDateTime;


public class Task 
{
	private String taskName;
	private LocalDateTime dueDate;
	private int priority;

	public Task() 
	{
		// TODO Auto-generated constructor stub
		
	}

	public Task(String taskName, LocalDateTime dueDate, int priority) {
		super();
		this.taskName = taskName;
		this.dueDate = dueDate;
		this.priority = priority;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", dueDate=" + dueDate + ", priority=" + priority + "]";
	}

}

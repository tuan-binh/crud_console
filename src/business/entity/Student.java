package business.entity;

import java.util.Scanner;

public class Student
{
	
	// camelCase
	private int studentId;
	private String studentName;
	private double avgScore;
	
	public Student()
	{
	}
	
	public Student(int studentId, String studentName, double avgScore)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.avgScore = avgScore;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public double getAvgScore()
	{
		return avgScore;
	}
	
	public void setAvgScore(double avgScore)
	{
		this.avgScore = avgScore;
	}
	
	public void inputData(Scanner scanner)
	{
		System.out.println("Student ID: ");
		this.studentId = Integer.parseInt(scanner.nextLine());
		System.out.println("Student Name: ");
		this.studentName = scanner.nextLine();
		System.out.println("Student Avg Score: ");
		this.avgScore = Double.parseDouble(scanner.nextLine());
	}
	
	@Override
	public String toString()
	{
		return "Student{" +
				  "studentId=" + studentId +
				  ", studentName='" + studentName + '\'' +
				  ", avgScore=" + avgScore +
				  '}';
	}
}

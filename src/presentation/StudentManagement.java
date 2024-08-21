package presentation;

import business.entity.Student;
import business.feature.IStudentFeature;
import business.feature.impl.StudentFeatureImpl;

import java.util.Scanner;

public class StudentManagement
{
	IStudentFeature studentFeature = new StudentFeatureImpl();
	
	public static void main(String[] args)
	{
		StudentManagement studentManagement = new StudentManagement();
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("------------------- MENU -------------------");
			System.out.println("1. Phương thức show all hiển thị tất cả student trong chương trình.\n" +
					  "2. Phương thức void addStudent(Student student) để thêm một sinh viên vào danh sách sinh viên\n" +
					  "3. Phương thức void removeStudent(int studentId) để xóa sinh viên có mã số sinh viên là studentId khỏi danh sách sinh viên.\n" +
					  "4. Phương thức Student findStudentById(int studentId) để tìm kiếm sinh viên có mã số sinh viên là studentId và trả về đối tượng Student tương ứng. Nếu không tìm thấy sinh viên nào thì hiển thị “không tìm thấy sinh viên” và trả về null.\n" +
					  "5. Phương thức getAverageScore tính và trả về điểm trung bình của tất cả student.\n" +
					  "6. Phương thức sortByScore sắp xếp sinh viên theo điểm tăng dần.\n" +
					  "7. Thoát");
			System.out.println("Nhập lựa chọn của bạn");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice)
			{
				case 1:
				{
					studentManagement.showAllStudent();
					break;
				}
				case 2:
				{
					studentManagement.addNewStudent(scanner);
					break;
				}
				case 3:
				{
					break;
				}
				case 4:
				{
					break;
				}
				case 5:
				{
					break;
				}
				case 6:
				{
					break;
				}
				case 7:
				{
					System.exit(0);
					break;
				}
				default:
					System.err.println("Vui lòng nhập lại từ 1 -> 7");
			}
		}
		while (true);
	}
	
	public void showAllStudent()
	{
		if(StudentFeatureImpl.students.isEmpty()){
			System.err.println("Danh sách trống...");
			return;
		}
		for (Student s: StudentFeatureImpl.students)
		{
			System.out.println(s);
		}
	}
	
	public void addNewStudent(Scanner scanner)
	{
		// nhập vào số lượng muốn them la n (0< n < 100)
		System.out.println("Nhập số lượng muốn thêm: ");
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++)
		{
			Student student = new Student();
			student.inputData(scanner);
			studentFeature.addStudent(student);
		}
	}
	
}

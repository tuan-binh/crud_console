package business.feature;

import business.entity.Student;

public interface IStudentFeature
{
	
	void addStudent(Student student);
	
	void remove(int deleteId);
	
	Student findStudentById(int id);
	
	double getAVGAllStudentScore();
	
	void sortByScore();

}

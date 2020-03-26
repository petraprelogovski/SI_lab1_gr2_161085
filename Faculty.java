import java.util.ArrayList;
import java.util.List;

public class Faculty extends Student {
    List<Student> students;
    String facultyName;

    public Faculty(String index, String firstName, String lastName, ArrayList<Integer> grades, List<Student> students, String facultyName) {
        super(index, firstName, lastName, grades);
        this.students=students;
        this.facultyName=facultyName;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void removeStudent(Student student)
    {
        students.remove(student);
    }

    public double averageGrade()
    {
        double suma=0.0;
        int brojac=0;
        for (Student s : students)
        {
            suma = s.getAverage();
            brojac++;
        }
        return suma/brojac;
    }
}

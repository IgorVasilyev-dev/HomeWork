package HomeWork5.comparators;

import HomeWork5.dto.Student;

import java.util.Comparator;

public class StudentScoreAndAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = Integer.compare(o1.getAge(), o2.getAge());
        if(result == 1) {
            return result;
        } else if (result == 0) {
            return Double.compare(o1.getScore(), o2.getScore());
        }
        return -1;
    }
}

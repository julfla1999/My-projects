package maps;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();

    public School(List<Integer> students) {
        this.students = students;
    }

    public int getSumOfStudents() {
        int sum = 0;
        for ( int oneClass : students )
            sum += oneClass;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}

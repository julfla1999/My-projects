public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {

        return this.grades[this.size-1];
    }

    public double averageGrade() {
        double sumOfGrades = 0;
        for (int i = 0; i < this.size; i++) {
          sumOfGrades = sumOfGrades + grades[i];
        }
        double average = sumOfGrades / this.size;
        return average;
    }

}

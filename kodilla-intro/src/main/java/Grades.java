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

    public int returnLastGrade() {
        if (this.size == 0) {
            return 0;
        }
        int lastGrade = this.grades[this.size - 1];
        return lastGrade;
    }
    public double returnAverageGrade() {
        if(this.size == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < this.grades.length; i++) {
            sum = sum + this.grades[i];
        }
        double avarageGrade = sum/this.size;
        return avarageGrade;
    }
}
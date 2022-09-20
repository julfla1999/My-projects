import java.util.Random;

public class RandomNumbers {
    private int min;
    private int max;

    public static void main(String[] args) {
        RandomNumbers result = new RandomNumbers();
        result.getCountOfRandomNumbers();
        System.out.println(result.showMinimum());
        System.out.println(result.showMaximum());
    }
    public void getCountOfRandomNumbers() {
        Random random = new Random();
        int sum = 0;
        this.max = -1;
        this.min = 50;
        while(sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
           if(temp > this.max) {
            this.max = temp;
           }
           if(temp < this.min) {
               this.min = temp;
           }
        }
        return;
    }

    public int showMinimum() {
        return this.min;
    }

    public int showMaximum() {
        return this.max;
    }
}

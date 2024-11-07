package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private int oddSum;
    private int evenSum;

    public Statistics() {
         this.sum = sum;
         this.count = count;
    }

    public void addNumber(int number) {
            this.sum = this.sum + number;

        }
        

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double)this.sum / this.count;
    }

}


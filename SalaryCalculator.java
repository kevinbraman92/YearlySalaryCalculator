package YearlySalaryCalculator;

public class SalaryCalculator {

    private double hours;
    private double rate;

    public SalaryCalculator(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return this.hours;
    }

    public double getRate() {
        return this.rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateYearlyRate() {
        return this.hours * this.rate * 52;
    }
}

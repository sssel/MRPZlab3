public class Check {
    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    private double cash;

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    private int ratePerMinute = 5;
    public Check(double cash){
        this.cash = cash;
    }
    public void AddCash(double cash){
        this.cash += cash;
    }
    public void talkedOfMinutes(int minutes){
        cash -= minutes*ratePerMinute;
    }
}

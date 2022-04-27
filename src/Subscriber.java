public class Subscriber {
    public int getNumber() {
        return number;
    }

    private int number;

    public Check getCheck() {
        return check;
    }

    public int getRatePerMinute(){
        return  check.getRatePerMinute();
    }
    private Check check;

    public Subscriber(int number, Check check){
        this.number = number;
        this.check = check;
    }
    public void payCheck(double cash){
        check.AddCash(cash);
    }
    public void talkedOfMinutes(int minutes){
        check.talkedOfMinutes(minutes);
    }
    public void use1Service(){
        double temp = check.getCash();
        check.setCash(temp-10);
    }
    @Override
    public String toString(){
        return "Номер: "+number+"\n"+"Стан рахунку: "+check.getCash()+"\nТариф: за хвилину розмови "+getRatePerMinute();
    }
}

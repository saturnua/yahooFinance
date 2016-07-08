public class Rates {
    private String name;
    private String rate;
    private String date;
    private String time;
    private String ask;
    private String bid;

    public Rates(){

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRate(String rate) {
        this.rate = rate;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setAsk(String ask) {
        this.ask = ask;
    }
    public void setBid(String bid) {
        this.bid = bid;
    }
    public String getName() {
        return name;
    }
    public String getRate() {
        return rate;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public String getAsk() {
        return ask;
    }
    public String getBid() {
        return bid;
    }

    @Override
    public String toString(){
       String s = getName() +" " + getRate() + " " + getDate() +" " + getTime() +" " + getAsk() +" " + getBid() + "\n";
        return s;
    }

}

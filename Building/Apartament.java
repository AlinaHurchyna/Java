package Building;
public class Apartament {
    private int  number;
    private String kod;
    private double price;

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean Checknumber(String text) {
        return kod.equals(text);
    }
}


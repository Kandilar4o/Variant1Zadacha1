package smg.bg;

public class Car extends Vehicle implements Comparable<Car>{

    private String marka;
    private String model;
    private int year;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car() {
        this.marka = "";
        this.model = "";
        this.year = 0;
    }

    public Car(String marka, String model, int year) {
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    @Override
    public void drive(){
        System.out.println("The vehicle is active!");
        boolean isActive = true;
    }

    @Override
    public int compareTo(Car o) {
        if(this.getYear() == o.getYear()){
            return 0;
        }
        else if(this.getYear() < o.getYear()){
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString(){
        return marka + " " + model + " " + year;
    }
}

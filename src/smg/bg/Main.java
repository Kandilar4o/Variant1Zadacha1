package smg.bg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car( "Fiat", "Bravo", 2008));
        cars.add(new Car( "Renault", "Clio", 2013));
        cars.add(new Car( "Subaru", "Impreza", 2006));
        cars.add(new Car( "Dacia", "Logan", 2009));
        Collections.sort(cars);
        cars.size();
        for( int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

    }
}

package Project2;

public class Car {

    //Create a Class Car that would have the following fields: carPrice and
    //color and method calculateSalePrice() which should be returning a
    //price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has a field
    //as weight and has its own implementation of calculateSalePrice()
    //method in which returned price is calculated as following: if
    //weight>2000 then returned price car should include 10% discount,
    //otherwise 20% discount.
    //The Sedan class has field as length and also does it is own
    //implementation of calculateSalePrice(): if length of sedan is >20 feet
    //then returned car price should include 5% discount, otherwise 10%
    //discount

     int carPrice;
    String carColor;

    public Car(int carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }

    public int calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car{

    int carLength;

    public Sedan(int carPrice, String carColor, int carLength) {
        super(carPrice, carColor);
        this.carLength=carLength;
    }

    @Override
    public int calculateSalePrice() {
        int Persentage = 0;
        if (carLength > 2000) {
            Persentage=carPrice*5/100;
            return carPrice-Persentage;

        } else  {
            Persentage=carPrice*10/100;
            return carPrice-Persentage;
        }
    }
}
class Truck extends Car {

    int carWeight;

    public Truck(int carPrice, String carColor, int carWeight) {
        super(carPrice, carColor);
        this.carWeight = carWeight;
    }


    @Override
    public int calculateSalePrice() {

        int Persentage = 0;
        if (carWeight > 2000) {
            Persentage=carPrice*10/100;
            return carPrice-Persentage;

        } else  {
           Persentage=carPrice*5/100;
            return carPrice-Persentage;
        }

    }
}

    class CarTester{
        public static void main(String[] args) {

            Sedan obj=new Sedan(20000,"Silver",15);
            System.out.println(obj.calculateSalePrice());

            Truck obj2=new Truck(40000,"Black",2500);
            System.out.println(obj2.calculateSalePrice());


        }

    }


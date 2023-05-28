package Project2;

     public interface Shape {
       public void calculateArea();
       public void calculatePerimiter();
    }
    class Circle implements Shape {

        @Override
        public void calculateArea() {

        }

        @Override
        public void calculatePerimiter() {

        }
    }
    class Square implements Shape {


        @Override
        public void calculateArea() {

        }

        @Override
        public void calculatePerimiter() {

        }
    }


class ShapeTester{

    public static void main(String[] args) {

       Circle obj=new Circle();
       obj.calculateArea();
       obj.calculatePerimiter();

       Square obj2= new Square();
       obj2.calculateArea();
       obj2.calculatePerimiter();
    }
}

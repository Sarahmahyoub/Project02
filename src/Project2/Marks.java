package Project2;

 abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects
    //by student A and by student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning the average percentage
    //of marks. Provide implementation of abstract method in classes 'A'
    //and 'B'. The constructor of student A takes the marks in three
    //subjects as its parameters and the marks in four subjects as its
    //parameters for student B. Test your code

     double subjectA;
     double subjectB;
     double subjectC;

     public Marks(double subjectA, double subjectB, double subjectC) {
         this.subjectA = subjectA;
         this.subjectB = subjectB;
         this.subjectC = subjectC;
     }

     public abstract double getPercentage ();

}

class studentA extends Marks{
    public studentA(double subjectA, double subjectB, double subjectC) {
        super(subjectA, subjectB, subjectC);
    }

    @Override
    public double getPercentage() {
        double ave =subjectA+subjectB+subjectC;
        return ave/3;
        }

    }


class studentB extends Marks{

     double subjectD;
    public studentB(double subjectA, double subjectB, double subjectC, double subjectD) {
        super(subjectA, subjectB, subjectC);
        this.subjectD=subjectD;
    }

    @Override
    public double getPercentage() {
        double ave =subjectA+subjectB+subjectC+subjectD;
        return ave/4;
    }

    }

class MarkTester{

    public static void main(String[] args) {
         studentA obj=new studentA(82, 65, 91.5);
        System.out.println(obj.getPercentage());
         studentB obj2=new studentB(85.3, 89, 93, 97.5);
        System.out.println(obj2.getPercentage());

        }
    }





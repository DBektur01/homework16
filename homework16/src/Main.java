import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Eagle(25, "Буркут prey")
                , new Eagle(30, "Буркут golden ")
                , new Turtle(100, "Таш бака"),
                new Turtle(150, "Бака"),
                new Shark(30, "акула"),
                new Shark(20, "акула-молот")};
        System.out.println("Get class");


        for (Animal animal : animals) {
            if (animal.getClass().equals(Eagle.class)) {

                animal.fly();


            } else if (animal.getClass().equals(Shark.class)) {
                animal.attack();


            } else if (animal.getClass().equals(Turtle.class)) {
                animal.swim();
            }


        }

        System.out.println("InstanceOf ");
        animals(animals);

    }


    public  static  void  animals(Animal[] animals){
        int sharkCounter =0;
        int eagleCounter =0;
        int turtlecounter =0;
        for (Animal animal : animals) {
            if (animal instanceof Shark) sharkCounter++;
            else if (animal instanceof Eagle) eagleCounter++;
            else if (animal instanceof Turtle) turtlecounter++;
            Animal[] sharks = new Animal[sharkCounter];
            Animal[] eagle = new Animal[eagleCounter];
            Animal[] turtle = new Animal[turtlecounter];

            for (int i = 0; i < animals.length; i++) {
                for (int s = 0; s < sharks.length; s++) {
                    if (animal instanceof Shark) sharks[s] = animals[i];

                }
                for (int e = 0; e < eagle.length; e++) {
                    if (animal instanceof Eagle) eagle[e] = animals[i];

                }
                for (int t = 0; t < turtle.length; t++) {
                    if (animal instanceof Turtle) turtle[t] = animals[i];

                }
            }
            System.out.println("turtle = " + Arrays.toString(turtle));
            System.out.println("eagle = " +Arrays.toString(eagle));
            System.out.println("sharks = " + Arrays.toString(turtle));


        }



    }
}
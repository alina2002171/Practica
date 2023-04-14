import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Class clas=new Class(5,"hello",new int[]{1,2,3,4,5});
//
//
//        System.out.println(clas.getNumber());
//        System.out.println(clas.getWorld());
//        System.out.println(Arrays.toString(clas.getArray()));


        Cow cow=new Cow("Beggi","blue",4,10,6);
        Cow cow1=new Cow("Beg","blue",3,5,3);
        Animal[] animal = {cow,cow1};


        System.out.println();

        Cat cat=new Cat("Kooli","black",3,6,2);
        Cat cat1=new Cat("Solli","black",3,6,2);
        Animal[]animals={cat,cat1};


        Dog dog=new Dog("Сиба-ну","yellow",8,23,"Star");
        Dog dog1=new Dog("Siba","black",10,23,"Map");
        Animal[] animal1={dog,dog1};

        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        if(a.equals("Cow")) {
            for (Animal value : animal) {

                System.out.println(value);
            }
        } else if (a.equals("Cat")) {
            for (Animal value : animals) {
                System.out.println(value);
            }
        }else {
            for (int i = 0; i <animal1.length ; i++) {

            }
            System.out.println(dog);
        }
    }
}
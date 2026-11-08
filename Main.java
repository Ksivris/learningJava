import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want a cat or a dog?");
        String choice = input.next();
        while(!choice.equals("cat") && !choice.equals("dog")){
         System.out.println("You can only choose cat or dog");
            choice = input.next();
        }
        System.out.println("Select a name for your pet");
        String name = input.next();
        System.out.println("How old do you want your pet to be?");
        int age = input.nextInt();
        while (age <0 || age >8){
            System.out.println("We do not have any pet in this age group");
            age = input.nextInt();
        }
        if (choice.equals("cat")){
            System.out.println("Select a breed for your pet>These are the available breeds");
            System.out.println(Cat.BREEDS.toString());
            String breed = input.next();
            while (!Cat.BREEDS.contains(breed)){
                System.out.println("Not one of the breeds we have.Try again: ");
                breed = input.next();
            }
            System.out.println("What colour do you want your pet to be?");
            String color = input.next();
            System.out.println("What weight for your pet to be?Choose between 2 and 20 kilos");
            double weight = input.nextDouble();
            while (weight < 2 || weight > 20){
                System.out.println("A cat cannot have this weight");
                weight = input.nextDouble();
            }
        Cat cat = new Cat(name,age,breed,color,weight);
            System.out.println("Here is your new cat");
            cat.print();
        }
        else{
            System.out.println("Choose your dog's breed.These are the available ones");
            System.out.println(Dog.BREEDS);
            String breed = input.next();
            while (!Dog.BREEDS.contains(breed)){
                System.out.println("Not in our selection of breeds");
                breed = input.next();
            }
            System.out.println("What colour do you want your dog to be?");
            String color = input.next();
            while (!color.equals("white") && (!color.equals("black")) && (!color.equals("brown"))){
                System.out.println("We are sorry we do not have a dog of this color. Choose another color");
                color = input.next();
            }
            System.out.println("How heavy will the dog you adapt will be");
            double weight = input.nextDouble();
            while (weight < 2 || weight > 50){
                System.out.println("we do not have a dog in this weight categoty");
                weight = input.nextDouble();
            }
            Dog dog = new Dog(name,age,breed,color,weight);
            dog.print();
        }
        
    }
}
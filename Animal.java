//Animal Class//i

public class Animal{
    
    int age;
    String gender;


    public void isMammal(){

        System.out.println("'isMammal()'' belongs to the Animal class and is a method.");
   
    }
    public void mate(){
        System.out.println("'mate()'' belongs to the Animal class and is a method.");
   
    }



    public static void main(String[] args){

     Animal myAnimal = new Animal();

     Fish myFish = new Fish();

     Zebra myZebra = new Zebra();

     
     
     myAnimal.isMammal();

     myAnimal.mate();

     myZebra.run();
    }
     

}



class Fish extends Animal{

    private int sizeInFeet;
    
    private void canEat(){
         System.out.println("'canEat()'' belongs to the Fish subclass of The Animal class and is a method.");

    }
    }

class Zebra extends Animal {

    public boolean is_wild;

    public void run(){
         System.out.println("'run()'' belongs to the Zebra subclass of The Animal class and is a method.");

    }
    
}

    


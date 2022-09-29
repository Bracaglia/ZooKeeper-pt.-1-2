public class Gorilla extends Mammal{

    public void throwSomething(){
        System.out.println("the gorilla threw a banana");
        energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println("the gorilla ate a banana");
        energyLevel += 10;
    }
    public void climb(){
        System.out.println("the gorilla climbed a tree");
        energyLevel -= 10;
    }
}

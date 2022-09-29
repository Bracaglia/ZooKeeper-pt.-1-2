public class Bat extends Mammal{
    public int energyLevel = 300;
    public void  fly(){
       // Print the sound of a bat taking off
        System.out.println("swoosh. Current Energy Level: "  + energyLevel);
        // decrease its energy by 50.
        energyLevel -= 50;
    }
    public void eatHumans(){
        // print the so- well, nevermind...
        System.out.println("so- well, never mind... Current Energy Level: "  + energyLevel);
        // increase its energy by 25.
        energyLevel += 25;
    }
    public void attackTown(){
        // decrease its energy by 100.
        energyLevel -= 100;
        //Print the sound of a town on fire
        System.out.println("screaming. Current Energy Level: " + energyLevel);
    }
    @Override
    public int displayEnergyLevel() {
        System.out.println(energyLevel);
        return this.energyLevel;

    }
}

package Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dragon dragon = new Dragon();
        dragon.name = "Max";
        dragon.rarity =  "Common";
        dragon.element = "Fire";
        dragon.age = 2;
        dragon.level = 10;
        dragon.color =  "Red";
        dragon.tall = 1.35;
        dragon.weight = 50.42;

        Dragon dragon2 = new Dragon();
        dragon2.name = "Thomas";
        dragon2.rarity =  "Common";
        dragon2.element = "Earth";
        dragon2.level = 10;
        dragon2.age = 1;
        dragon2.color =  "Brown";
        dragon2.tall = 0.75;
        dragon2.weight = 82.47;

        System.out.println("Dragon description");
        System.out.println("Name" + ":" + dragon.name);
        System.out.println("Level" + ":" + dragon.level);
        System.out.println("Rarity" + ":" + dragon.rarity);
        System.out.println("Element" + ":" + dragon.element);
        System.out.println("Age" + ":" + dragon.age);
        System.out.println("Color" + ":" + dragon.color);
        System.out.println("Tall" + ":" + dragon.tall);
        System.out.println("Weight" + ":" + dragon.weight);


        System.out.println(" ");
        System.out.println("Dragon2 description");
        System.out.println("Name" + ":" + dragon.name);
        System.out.println("Level" + ":" + dragon.level);
        System.out.println("Rarity" + ":" + dragon.rarity);
        System.out.println("Element" + ":" + dragon.element);
        System.out.println("Age" + ":" + dragon.age);
        System.out.println("Color" + ":" + dragon.color);
        System.out.println("Tall" + ":" + dragon.tall);
        System.out.println("Weight" + ":" + dragon.weight);


    }
}

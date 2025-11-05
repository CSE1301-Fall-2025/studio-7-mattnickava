package studio7;
public class Die
{   
    /**
     * The number of sides on the die
     */
    private int numOfSides;

    /**
     * The default constructor which sets the number of sides to six
     */
    public Die(){
        numOfSides = 6;
    }

    /**
     * 
     * @param numSides number of sides that the die object will have
     */
    public Die(int numSides)
    {
        numOfSides = numSides;
    }

    /**
     * 
     * @return Returns a simulated roll of the dice. Will return a number in the range from 1 to the number of sides that it has
     */
    public int roll(){
        int randomRoll = (int) (Math.random() * ((numOfSides - 1) + 1)) + 1;
        return randomRoll;
    }

    public static void main(String[] args)
    {
        Die sixSidedDie = new Die();
        Die eightSidedDie = new Die(8);

        System.out.println(sixSidedDie.roll());
        System.out.println(eightSidedDie.roll());

    }
}
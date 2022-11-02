import java.util.Random;

public class MagicBall 
{
    private static final String YES = "Yes";
    private static final String NO = "No";
    private static final String TRY_AGAIN = "Try again";
    private static final String MAYBE = "Maybe";

    public static String getPrediction() 
    {
        int random = new Random().nextInt(4);
        if (random == 0) 
        {
            return YES;
        } 
        else if (random == 1) 
        {
            return NO;
        } 
        else if (random == 2) 
        {
            return TRY_AGAIN;
        } 
        else if (random == 3) 
        {
            return MAYBE;
        } 
        else 
        {
            return null;
        }
    }
}

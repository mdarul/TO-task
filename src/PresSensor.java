/**
 * Created by Michał on 02.05.2017.
 */
import java.util.Random;

public class PresSensor implements ISensor
{
    public PresSensor(){}

    public float getValue() {
        Random value = new Random();
        return 1000 + value.nextFloat()*20;
    }
}


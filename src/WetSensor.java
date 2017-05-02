/**
 * Created by Michał on 02.05.2017.
 */
import java.util.Random;

public class WetSensor implements ISensor
{
    public WetSensor(){}

    public float getValue() {
        Random value = new Random();
        return value.nextFloat()*100;
    }
}

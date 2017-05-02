/**
 * Created by Michał on 02.05.2017.
 */
import java.util.Random;

public class TempSensor implements ISensor
{
    public TempSensor(){}

    public float getValue() {
        Random value = new Random();
        return value.nextFloat()*60 - 15;
    }
}

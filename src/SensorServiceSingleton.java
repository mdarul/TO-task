import java.util.Arrays;
import java.util.List;

/**
 * Created by Michał on 02.05.2017.
 */
public class SensorServiceSingleton {

    private static SensorServiceSingleton instance;
    private List<ISensor> sensorList;

    private SensorServiceSingleton(){
        ISensor wetSensor = new WetSensor();
        ISensor tempSensor = new TempSensor();
        ISensor presSensor = new PresSensor();

        sensorList = Arrays.asList(wetSensor, tempSensor, presSensor);
    }

    public static SensorServiceSingleton getInstance(){
        if(instance == null){
            instance = new SensorServiceSingleton();
        }
        return instance;
    }

    public float getWetness(){
        return sensorList.get(0).getValue();
    }

    public float getTemperature(){
        return sensorList.get(1).getValue();
    }

    public float getPressure(){
        return sensorList.get(2).getValue();
    }
}

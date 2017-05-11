/**
 * Created by Michał on 02.05.2017.
 */
public class DisplayerComponent implements IComponent{

    public DisplayerComponent(){}

    public void doAction(){
        System.out.println(service.getTemperature());
        System.out.println(service.getPressure());
        System.out.println(service.getWetness());
    }
}

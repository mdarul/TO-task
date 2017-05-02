/**
 * Created by Michał on 02.05.2017.
 */
public class StatisticsComponent implements IComponent{

    public StatisticsComponent(){}

    public void doAction() {
        float[] stats = new float[3];
        stats[0] = service.getTemperature();
        stats[1] = service.getPressure();
        stats[2] = service.getWetness();
        System.out.println("Statistics are saved now.");
    }
}

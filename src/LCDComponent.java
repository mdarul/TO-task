/**
 * Created by Michał on 02.05.2017.
 */
public class LCDComponent implements IComponent{

    public LCDComponent(){}

    public void doAction() {
        System.out.println((int)service.getTemperature());
    }
}

/**
 * Created by Michał on 02.05.2017.
 */
public class PrognosisComponent implements IComponent{

    public PrognosisComponent(){}

    public void doAction() {
        System.out.println("Nie wiem, ale teraz jest" + service.getTemperature() + " stopni Celsjusza");
    }
}

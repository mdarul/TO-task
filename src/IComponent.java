/**
 * Created by Michał on 02.05.2017.
 */
public interface IComponent {
    SensorServiceSingleton service = SensorServiceSingleton.getInstance();
    void doAction();
}

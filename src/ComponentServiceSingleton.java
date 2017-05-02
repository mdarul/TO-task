import java.util.Arrays;
import java.util.List;

/**
 * Created by Michał on 02.05.2017.
 */
public class ComponentServiceSingleton {
    private static ComponentServiceSingleton instance;
    public List<IComponent> componentList;

    private ComponentServiceSingleton(){
        IComponent LCD = new LCDComponent();
        IComponent displayer = new DisplayerComponent();
        IComponent statistics = new StatisticsComponent();
        IComponent prognosis = new PrognosisComponent();

        componentList = Arrays.asList(LCD, displayer, statistics, prognosis);
    }

    public static ComponentServiceSingleton getInstance(){
        if(instance == null){
            instance = new ComponentServiceSingleton();
        }
        return instance;
    }
}

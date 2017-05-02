/**
 * Created by Michał on 02.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        long timeStart, timeStop;

        ComponentServiceSingleton service = ComponentServiceSingleton.getInstance();

        System.out.println(service.componentList.get(0).getClass().getName());
        timeStart = System.nanoTime();
        service.componentList.get(0).doAction();
        timeStop = System.nanoTime();
        System.out.println("Execution time - " + (timeStop - timeStart)/1e9 + "s\n");

        System.out.println(service.componentList.get(1).getClass().getName());
        timeStart = System.nanoTime();
        service.componentList.get(1).doAction();
        timeStop = System.nanoTime();
        System.out.println("Execution time - " + (timeStop - timeStart)/1e9 + "s\n");

        System.out.println(service.componentList.get(2).getClass().getName());
        timeStart = System.nanoTime();
        service.componentList.get(2).doAction();
        timeStop = System.nanoTime();
        System.out.println("Execution time - " + (timeStop - timeStart)/1e9 + "s\n");

        System.out.println(service.componentList.get(3).getClass().getName());
        timeStart = System.nanoTime();
        service.componentList.get(3).doAction();
        timeStop = System.nanoTime();
        System.out.println("Execution time - " + (timeStop - timeStart)/1e9 + "s\n");
    }
}

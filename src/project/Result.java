package project;

public class Result {
    void printResult() {
        TrafficLight trafficLight = new TrafficLight(TrafficLightColor.RED);
        System.out.println("Колір світлофора: " + trafficLight.getCurrentColor() +
                " - " + trafficLight.getCurrentColor().getDescription());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        trafficLight.changeColor();
        System.out.println("Колір світлофора: " + trafficLight.getCurrentColor() +
                " - " + trafficLight.getCurrentColor().getDescription());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        trafficLight.changeColor();
        System.out.println("Колір світлофора: " + trafficLight.getCurrentColor() +
                " - " + trafficLight.getCurrentColor().getDescription());
    }
}


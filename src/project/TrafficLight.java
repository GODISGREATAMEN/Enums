package project;

class TrafficLight {
    private TrafficLightColor currentColor;

    public TrafficLight(TrafficLightColor initialColor) {
        this.currentColor = initialColor;
    }

    public TrafficLightColor getCurrentColor() {
        return currentColor;
    }

    public void changeColor() {
        switch (currentColor) {
            case RED -> currentColor = TrafficLightColor.YELLOW;
            case YELLOW -> currentColor = TrafficLightColor.GREEN;
            case GREEN -> currentColor = TrafficLightColor.RED;
        }
    }
}

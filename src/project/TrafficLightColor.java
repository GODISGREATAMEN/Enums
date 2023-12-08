package project;

enum TrafficLightColor {
    RED("Стояти"),
    YELLOW("Приготуватися"),
    GREEN("Рухатися");

    private final String description;

    TrafficLightColor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

package Transport;

public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public void transportReady() {
        System.out.println(getClass().getName() + " " + model + " готов к работе");
    }



}

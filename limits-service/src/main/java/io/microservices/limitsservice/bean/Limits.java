package io.microservices.limitsservice.bean;

public class Limits {

    private int minimum;
    private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public Limits() {
    }

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}

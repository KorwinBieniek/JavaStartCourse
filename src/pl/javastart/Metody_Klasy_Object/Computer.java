package pl.javastart.Metody_Klasy_Object;

import java.util.Objects;

public class Computer {
    String producer;
    int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer producer is " + producer +
                ", model is " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return model == computer.model &&
                Objects.equals(producer, computer.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}

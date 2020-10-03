package pl.javastart.Dziedziczenie_Ex1;

public class Tire extends Part{

    private int width;
    private int size;

    public Tire(int idNum, String producerName, String productSerie, int width, int size) {
        super(idNum, producerName, productSerie);
        this.width = width;
        this.size = size;
    }

    @Override
    public String toString() {
        return getProducerName() + " " + getProductSerie() + " " + getIdNum() +
                " Tire{" +
                "width=" + width +
                ", size=" + size +
                '}';
    }
}

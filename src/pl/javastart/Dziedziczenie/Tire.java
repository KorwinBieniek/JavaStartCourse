package pl.javastart.Dziedziczenie;

public class Tire extends Part{
    private int size;
    private int width;

    public Tire(int serialNumber, String producer, String model, String product_serie, int size, int width) {
        setSerialNumber(serialNumber);
        setProducer(producer);
        setModel(model);
        setProduct_serie(product_serie);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    void printInfo()
    {
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getProduct_serie()
                + ", " + size + ", " + width);
    }
}

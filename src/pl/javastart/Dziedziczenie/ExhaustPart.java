package pl.javastart.Dziedziczenie;

public class ExhaustPart extends Part{
    private boolean europeanStandard;

    public ExhaustPart(int serialNumber, String producer, String model, String product_serie, boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
        setSerialNumber(serialNumber);
        setProducer(producer);
        setModel(model);
        setProduct_serie(product_serie);
    }

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }

    void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getProduct_serie()
                + ", " + europeanStandard);
    }
}

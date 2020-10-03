package pl.javastart.Dziedziczenie_Ex1;

public class ExhaustPart extends Part{

    private String europeanStandard;

    public ExhaustPart(int idNum, String producerName, String productSerie, String europeanStandard) {
        super(idNum, producerName, productSerie);
        this.europeanStandard = europeanStandard;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ExhaustPart{" +
                "europeanStandard='" + europeanStandard + '\'' +
                '}';
    }
}

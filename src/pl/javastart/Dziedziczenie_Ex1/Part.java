package pl.javastart.Dziedziczenie_Ex1;

public abstract class Part {
    private int idNum;
    private String producerName;
    private String productSerie;

    public Part(int idNum, String producerName, String productSerie) {
        this.idNum = idNum;
        this.producerName = producerName;
        this.productSerie = productSerie;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getProductSerie() {
        return productSerie;
    }

    public void setProductSerie(String productSerie) {
        this.productSerie = productSerie;
    }

    @Override
    public String toString() {
        return "Part{" +
                "idNum=" + idNum +
                ", producerName='" + producerName + '\'' +
                ", productSerie='" + productSerie + '\'' +
                '}';
    }
}

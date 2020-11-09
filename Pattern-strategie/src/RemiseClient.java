public class RemiseClient implements CalculTotal{

    private double discount;
    private double seuil;

    public RemiseClient(double discount, double seuil) {
        this.discount = discount;
        this.seuil = seuil;
    }

    @Override
    public double getTotal(Vente v) {
        double pdt = v.getPreDisc();
        if(pdt<seuil)
            return pdt;
        else
            return pdt-discount;
    }
}

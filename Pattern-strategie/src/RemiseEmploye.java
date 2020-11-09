public class RemiseEmploye implements CalculTotal{

    private double pourcentage;

    public RemiseEmploye(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    @Override
    public double getTotal(Vente v) {
        return (v.getPreDisc() - v.getPreDisc()*pourcentage);
    }
}

public class ClientDisc implements DiscountStrategy{
    @Override
    public double getDiscount(Vente vente) {
        return vente.getPreDisc()*(1-0.3);
    }
}

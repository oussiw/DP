public class BlackFridayDisc implements DiscountStrategy {
    @Override
    public double getDiscount( Vente vente) {
        return vente.getPreDisc()*(1-0.6);
    }
}

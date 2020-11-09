public class EmployeeDIsc implements DiscountStrategy{
    @Override
    public double getDiscount( Vente vente) {
        return vente.getPreDisc()*(1-0.5);
    }
}

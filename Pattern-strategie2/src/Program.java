public class Program {
    public static void main(String[] args) {
        Vente vente = new Vente(new BlackFridayDisc());
        vente.addProduit("pain",2.0);
        vente.addProduit("riz",10.0);
        vente.addProduit("fromage",30.0);
        System.out.println(vente.getPreDisc());
        System.out.println(vente.getDiscount());
    }
}

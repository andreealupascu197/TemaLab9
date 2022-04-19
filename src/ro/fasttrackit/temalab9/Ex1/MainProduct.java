package ro.fasttrackit.temalab9.Ex1;

public class MainProduct {
    public static void main(String[] args) {
        Cosmetics makeUpProduct = new Cosmetics(
                10,
                "eyeliner",
                "waterproof",
                20,
                "black",
                5
        );
        ProductController product = new ProductController(makeUpProduct);
        System.out.println(product.getInfoAboutProduct());
        System.out.println(makeUpProduct.getDescription());
        System.out.println(makeUpProduct.getWeight());
        System.out.println(makeUpProduct.getQuantity());



        Electronics electronicProduct = new Electronics(
                2000,
                "Iphone 13 Pro",
                "256GB",
                40,
                "Phone",
                10,
                20,
                10,
                5
        );
        ProductController product2 = new ProductController(electronicProduct);
        System.out.println(product2.getInfoAboutProduct());
        System.out.println(electronicProduct.getPrice());
        System.out.println(electronicProduct.getName());
        System.out.println(electronicProduct.getDescription());
        System.out.println(electronicProduct.getWeight());
        System.out.println(electronicProduct.getType());
        System.out.println(electronicProduct.getLength());

        Fridge fridge = new Fridge(
                1000,
                "Arctic",
                "Clasa A",
                100,
                "Frigider",
                100,
                200,
                50,
                50,
                10.5
        );
        ProductController product3 = new ProductController(fridge);
        System.out.println(product3.getInfoAboutProduct());
        System.out.println(fridge.getPrice());
        System.out.println(fridge.getDescription());
        System.out.println(fridge.getTemperature());
        System.out.println(fridge.getName());
        System.out.println(fridge.getQuantity());
        System.out.println(fridge.getWidth());

    }
}

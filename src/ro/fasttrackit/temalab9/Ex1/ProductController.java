package ro.fasttrackit.temalab9.Ex1;

public class ProductController {
    private Product product;

    public ProductController(Product product) {
        this.product = product;
    }

    public String getInfoAboutProduct() {
        return "This product is a " + product.getName() + ". Price is " + product.getPrice() + " lei. Description: " + product.getDescription() + ". In stock: " +product.getQuantity();
    }
}

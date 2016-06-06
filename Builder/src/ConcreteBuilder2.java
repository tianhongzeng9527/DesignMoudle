/**
 * Created by tian on 16-6-4.
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("x");
    }

    @Override
    public void buildPartB() {
        product.add("y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

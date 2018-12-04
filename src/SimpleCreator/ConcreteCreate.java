package SimpleCreator;

public class ConcreteCreate extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> C){
        Product product=null;
        try {
            product=(Product)Class.forName(C.getName()).newInstance();
        }catch (Exception e){

        }
        return (T) product;
    }
}

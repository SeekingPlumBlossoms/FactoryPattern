package SimpleCreator;

public class Client {
    public static  void main(String[] args){
        Creator creator=new ConcreteCreate();
        Product product=creator.createProduct(ConcreteProduct1.class);
        /***
         * 继续处理业务
         */
    }
}

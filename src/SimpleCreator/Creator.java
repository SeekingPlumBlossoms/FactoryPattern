package SimpleCreator;

import SimpleCreator.Product;

public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> T);
}

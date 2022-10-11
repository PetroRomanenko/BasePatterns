package com.ferros.basepatterns.structural.proxy.MyVariant;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

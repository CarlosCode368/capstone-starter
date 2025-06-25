package org.yearup.data.mysql;

import org.springframework.stereotype.Component;
import org.yearup.data.ShoppingCartDao;
import org.yearup.models.ShoppingCart;

@Component
public class MySqlShoppingCartDao implements ShoppingCartDao {


    public ShoppingCart getCartByUserId(int userId) {

        return null;
    }


    public void addToCart(int userId, int productId) {

    }


    public void updateCartItem(int userId, int productId, int quantity) {

    }


    public void clearCart(int userId) {

    }
}
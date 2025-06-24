package org.yearup.data;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.yearup.models.Product;
import org.yearup.models.ShoppingCart;

import java.security.Principal;

public interface ShoppingCartDao
{
    ShoppingCart getCartByUserId(int userId);

    void addToCart(int userId, int productId);

    void updateCartItem(int userId, int productId, int quantity);

    void clearCart(int userId);
}
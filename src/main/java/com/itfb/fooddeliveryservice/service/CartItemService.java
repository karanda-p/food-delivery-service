package com.itfb.fooddeliveryservice.service;

import com.itfb.fooddeliveryservice.model.domain.cart.Cart;
import com.itfb.fooddeliveryservice.model.domain.cart.CartItem;
import com.itfb.fooddeliveryservice.repository.CartItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class CartItemService {

    private final CartItemRepository cartItemRepository;

    Collection<CartItem> findAllCartItemsByCartId(Long cartId){
        return cartItemRepository.findAllByCartId(cartId);
    }
}

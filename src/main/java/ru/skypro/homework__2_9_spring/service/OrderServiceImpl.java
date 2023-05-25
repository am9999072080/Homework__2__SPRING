package ru.skypro.homework__2_9_spring.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework__2_9_spring.model.Cart;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return cart.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}

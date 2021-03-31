package com.itfb.deliveryrestapi.repository;

import com.itfb.deliveryrestapi.model.Product;
import com.itfb.deliveryrestapi.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Collection<Product> getAllByRestaurantId(Restaurant restaurant);
}

package com.kodluyoruz.homework4.repository;

import com.kodluyoruz.homework4.model.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {
    List<OrderItem> getByOrder_id(int basketId);

}

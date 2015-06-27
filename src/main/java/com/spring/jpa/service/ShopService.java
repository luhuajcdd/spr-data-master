package com.spring.jpa.service;

import java.util.List;

import com.spring.jpa.exception.ShopNotFound;
import com.spring.jpa.model.Shop;

public interface ShopService {
	
	public Shop create(Shop shop);
	public Shop delete(int id) throws ShopNotFound;
	public List<Shop> findAll();
	public Shop update(Shop shop) throws ShopNotFound;
	public Shop findById(int id);

}

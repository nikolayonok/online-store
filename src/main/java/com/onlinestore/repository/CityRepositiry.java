package com.onlinestore.repository;

import com.onlinestore.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepositiry extends JpaRepository<City, Long> {
}

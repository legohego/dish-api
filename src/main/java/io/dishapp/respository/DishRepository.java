package io.dishapp.respository;

import org.springframework.data.repository.CrudRepository;

import io.dishapp.models.Dish;

public interface DishRepository extends CrudRepository<Dish, String> {

}

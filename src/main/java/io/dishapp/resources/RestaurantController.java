package io.dishapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.dishapp.models.Dish;
import io.dishapp.services.DishService;
import io.dishapp.services.RestaurantService;

public class RestaurantController {

@Autowired
public RestaurantService restaurantService;
@RequestMapping("/restaurant")
@ResponseBody
public List<Dish> getDishes() {
	return restaurantService.getRestaurants();
}

@RequestMapping(method=RequestMethod.GET, value = "/restaurant/{filter}/{location}/{dish}")
public Dish getFilteredDishes(@PathVariable String filter, @PathVariable String location, @PathVariable String dish) {
	return restaurantService.getFilteredRestaurants(filter, location, dish);
}

@RequestMapping(method=RequestMethod.GET, value = "/restaurant/{id}")
public Dish getDishes(@PathVariable String id) {
	return restaurantService.getRestaurants(id);
}
@RequestMapping(method=RequestMethod.POST, value = "/restaurant/")
public void setDish(@RequestBody Dish dish){
	restaurantService.addRestaurants(dish);
}

}
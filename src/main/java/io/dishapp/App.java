package io.dishapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.dishapp.models.Dish;
import io.dishapp.service.impl.DishServiceImpl;

@SpringBootApplication
public class App implements CommandLineRunner{
    @Autowired
    private DishServiceImpl DishServiceImpl;
  
	public static void main(String[] args) {
    SpringApplication.run(App.class, args);

	}

	@Override
	public void run(String... arg0) throws Exception {
		DishServiceImpl.createDish(new Dish ("Quay Street Kitchen", "Lovely food", "1"));
		DishServiceImpl.createDish(new Dish ("Tusnu", "nice food", "2"));
		DishServiceImpl.createDish(new Dish ("Buskers", "Best food", "3"));
		DishServiceImpl.createDish(new Dish ("Dail Bar", "Worst food", "4"));
		DishServiceImpl.createDish(new Dish ("Front Door", "Taste food", "5"));
		DishServiceImpl.createDish(new Dish ("Kings Head", "Average food", "6"));
		
	}

}

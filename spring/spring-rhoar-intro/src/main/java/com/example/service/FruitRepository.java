package com.example.service;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface FruitRepository extends CrudRepository<Fruit, Integer> {
}
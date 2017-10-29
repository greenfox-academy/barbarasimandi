package com.greenfox.club.model;

import java.util.List;

public class Fox {
    String name;
    List<Trick> listOfTricks;
    Food food;
    Drink drink;

  public Fox() {
  }

  public Fox(String name, List<Trick> listOfTricks, Food food, Drink drink) {
    this.name = name;
    this.listOfTricks = listOfTricks;
    this.food = food;
    this.drink = drink;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setListOfTricks(List<Trick> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public int getTrickNumber() {
    return listOfTricks.size();
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public List<Trick> getListOfTricks() {
    return listOfTricks;
  }

  public Food getFood() {
    return food;
  }

  public Drink getDrink() {
    return drink;
  }
}

package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {

  private static VendingMachineImpl instance = new VendingMachineImpl();
  private Map<String, Integer> drinkPrices = new HashMap<>();
  private Map<String, Boolean> drinkFizzy = new HashMap<>();
  private int insertedMoney = 0;

  public static VendingMachine getInstance() {
    return instance;
  }

  public VendingMachineImpl() {
    drinkPrices.put("ScottCola", 75);
    drinkPrices.put("KarenTea", 100);
    drinkFizzy.put("ScottCola", true);
    drinkFizzy.put("KarenTea", false);
  }

  @Override
  public void insertQuarter() {
    insertedMoney += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    Integer price = drinkPrices.get(name);
    Boolean isFizzy = drinkFizzy.get(name);
    if (price == null) {
      throw new UnknownDrinkException();
    }

    if (insertedMoney < price) {
      throw new NotEnoughMoneyException();
    }

    insertedMoney -= price;

    DrinkImpl drink = new DrinkImpl(name, isFizzy);
    return drink;
  }
}

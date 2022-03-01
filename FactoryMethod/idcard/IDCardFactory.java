package idcard;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }
  protected void registerProduct(Product product) {
    System.out.println(product + "を登録しました。");
  }
}
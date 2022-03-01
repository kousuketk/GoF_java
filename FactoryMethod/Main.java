import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("name1");
    Product card2 = factory.create("name2");
    Product card3 = factory.create("name3");
    card1.use();
    card2.use();
    card3.use();
  }
}

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import shop.*;

public class ShopTest {

  Shop shop;
  Double sales;
  Double refunds;

  @Before
  public void Before() {
    shop = Shop("NIKE");
  }

  @Test
  public void canGetName() {
    String name = shop.getName();
    assertEquals("NIKE", name);
  }

  @Test
  public void canGetSales() {
    assertEquals(0.00, store.getSales(), 0);
  }

  @Test
  public void canGetRefunds() {
    assertEquals(0.00, store.getRefunds(), 0);
  }

  @Test
  public void canUpdateSales() {
    Double  newSales = shop.updateSales(1000.00)
    assertEquals(1000.00, newSales, 0);
  }

  @Test
  public void canUpdateSales() {
    Double newRefunds = shop.updateRefunds(500.00)
    assertEquals(500.00, newRefunds, 0);
  }

  @Test
  public void canGetIncomeReport() {
    shop.updateSales(1000.00)
    assertEquals(?, store.getIncomeReport, 0);
  }
}
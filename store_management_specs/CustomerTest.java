import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import shop.*;
 
public class CustomerTest {

  Customer customer;
  CreditCard card1
  DebitCard card2

  @Before
  public void before() {

    customer = new Customer("Chris");
    card1 = new CreditCard("Barclays", CardType.VISA_CREDIT);
    card2 = new DebitCard("HSBC", CardType.VISA_DEBIT);
  }

  @Test
  public void testCustomerSetUp() {
    assertEquals("Chris", customer.getName());
    assertEquals(customer.getCreditCard());
    assertEquals(customer.getDebitCard());
  }
}

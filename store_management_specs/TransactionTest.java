import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import shop.*;

public class TransactionTest {

 Customer customer;
 Shop shop;
 CreditCard card1;
 DebitCard card2;

 Transaction transaction;

 @Before
 public void Before() {

  customer = new Customer();
  shop = new shop();

  card1 = new CreditCard
  card2 = new DebitCard

  transaction = new Transaction(customer, shop);
 }
package example.codeclan.com.shop;
import java.util.*;

public class Transaction{

     private Customer customer;
     private Shop shop;
     private Payable paymentMethod;

     public Transaction(Customer customer, Shop shop){
          HashMap<Payable, Double> paymentOptions = customer.getPaymentOptions();
          Payable defaultPaymentMethod = findDefaultPaymentMethod(paymentOptions);
          this.customer = customer;
          this.shop = shop;
          this.paymentMethod = defaultPaymentMethod;
     }

     public Payable findDefaultPaymentMethod(HashMap<Payable, Double> paymentOptions) {
          for (Payable paymentMethod : paymentOptions.keySet()) {
               boolean defaultState = paymentMethod.getDefaultState();
               if (defaultState == true) {
                    return paymentMethod;
               }

               return null;
          } 
     }

     public Payable getDefaultPaymentMethod() { 
          return this.paymentMethod; 
     }



     public void makeTransaction(Payable paymentMethod, TransactionType transaction) {

     if (transaction == TransactionType.SALE) {
          shop.updateSales(amount);
          customer.makePayment(paymentMethod, amount);


     } else if (transaction == TransactionType.REFUND) {
          shop.updateRefunds(amount);
          customer.receiveRefund(paymentMethod, amount);

     }
}


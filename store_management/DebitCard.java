public class DebitCard extends Card {

 private String bank;

 public DebitCard(String bank, CardType cardType) {
  this.bank = bank;
  this.cardType = cardType;
  this.defaultState = false;
}

}
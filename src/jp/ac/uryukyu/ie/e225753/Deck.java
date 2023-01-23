import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> card_list;
    public Deck(){
        card_list = new ArrayList<Card>();
    }

    public void makeDeck() {

        for (int x = 1; x < 14; x++) {
            Card a = new Card(x, "♠");
            card_list.add(a);
        }
        for (int x = 1; x < 14; x++) {
            Card a = new Card(x, "♦");
            card_list.add(a);
        }
        for (int x = 1; x < 14; x++) {
            Card a = new Card(x, "♣");
            card_list.add(a);
        }
        for (int x = 1; x < 14; x++) {
            Card a = new Card(x, "❤");
            card_list.add(a);
        }
    }
    public Card getCard(int a){
        return card_list.get(a);
    }
}

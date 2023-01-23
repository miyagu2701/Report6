import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Card> card_list = new ArrayList<Card>();
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

        /*for (Card li : card_list) {
            String x = li.getMark();
            int y = li.getNum();
            System.out.println(x + y);
        }*/

    }
}

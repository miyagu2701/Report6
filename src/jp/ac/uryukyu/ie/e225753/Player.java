import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Card> playerCard;

    public Player() {
        playerCard = new ArrayList<Card>();
    }

    public void getCard(Card newCard) {
        playerCard.add(newCard);
    }

    public int getSize() {
        return playerCard.size();
    }

    public void checkCard(int a) {
        Card x = playerCard.get(a);
        System.out.println(x.getMark() + x.getNum());
    }

}

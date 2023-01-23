import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Random rnd = new Random(); 
        Player play1 = new Player();

        System.out.println("ゲームスタート");
        deck.makeDeck();


        for(int i = 0;i < 2; i++){
            int a = rnd.nextInt(52);
            play1.getCard(deck.getCard(a));
        }
        System.out.println("プレイヤーのカードは");
        for(int i = 0; i<play1.getSize(); i++){
            play1.checkCard(i);
        }

    }
}

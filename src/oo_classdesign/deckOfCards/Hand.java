package oo_classdesign.deckOfCards;

import java.util.ArrayList;
import java.util.List;

public class Hand <T extends Card> {

    protected List<T> cards = new ArrayList<T>();

    public int score() {
        int score = 0;
        for (T card : cards) {
            score += card.value();
        }
        return score;
    }

    public void addCard(T card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }
}
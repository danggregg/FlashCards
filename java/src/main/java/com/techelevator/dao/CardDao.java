package com.techelevator.dao;

import com.techelevator.model.Card;
import com.techelevator.model.User;

import java.util.List;


public interface CardDao {
    public List<Card> findCardByTag(String tag);

    public List<Card> findCardByCreator(String creator);

    public List<Card> findCardByModule(int module);

    public Card getCardById(int id);

    public List<Card> getAllCards(String username);

    public List<Card> findCardByDeck(String deck);

    public String editCard(Card card);

    public String createCard(int module, String creator, String tag, String question, String answer, String deck);

    public void removeCardFromDeck(int id);

    public void addCardToDeck(int flashcardId, String deckname);


}

package com.treazy.cards.implementation;

import com.treazy.cards.Card;

/**
 * The purpose of CardPointSystem is to further extend the possibility
 * of calculating the points of a card.
 * 
 * @author Panagiotis Peikidis
 * @version 1.0
 */
public interface CardPointSystem {
	/**
	 * Gets a card and calculates, depending on the implementation and returns its' points
	 * 
	 * @param card
	 * 		the card to be calculated
	 * @return
	 * 		the points of the card.
	 */
	public int getPoints(Card card);
}

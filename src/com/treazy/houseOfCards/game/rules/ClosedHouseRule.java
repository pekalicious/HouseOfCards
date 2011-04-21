package com.treazy.houseOfCards.game.rules;

import com.treazy.cards.Card;
import com.treazy.houseOfCards.game.House;

/**
 * This Rule looks at the state of the House. If the House is closed and a
 * Card is beeing added, then it returns false. Otherwise it is true.
 * 
 * @author Panagiotis Peikidis
 * @version 1.1
 *
 */
public final class ClosedHouseRule implements PermissionRule {

  public boolean isAllowed(House house, Card card) {
    if ( !house.isOpened() )
      return false;
    
    return true;
  }

  public String getDescription() {
    return "House is Closed";
  }

  public String getName() {
    return "Closed House Rule";
  }

}

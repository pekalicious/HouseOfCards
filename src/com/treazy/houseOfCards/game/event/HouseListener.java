package com.treazy.houseOfCards.game.event;

import java.util.List;

import com.treazy.houseOfCards.game.rules.ActionRule;

/**
 * This interface is used when various events pop up inside
 * a House (i.e. a specific amount of points are reached).
 * 
 * @version 1.0
 *
 */
public interface HouseListener {
  /** 
   * When the state of the House's change this method is called.
   *  
   * @param appliedRules
   *    applied ActionRules 
   * */
  public void stateChanged(List<ActionRule> appliedRules);
}

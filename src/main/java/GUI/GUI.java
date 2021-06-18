/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Gavin
 */
public class GUI extends javax.swing.JFrame {
  /** Accessor for GUI Frame
   *
   *  @return GUI Frame
   */
  public static GUI getInstance() {
    if (theGUI == null) {
      theGUI = new GUI();
    }
    return theGUI;
  }
  
  /** Show a specific card and add it to history
   * Will do nothing if that specific card does not exist
   *
   *  @param name the name of the card to show.
   */
  public void goToCard(String name) {
    if (! name.equals(currentCardName)) {
      history.put(name, currentCardName);
      currentCardName = name;
      ((java.awt.CardLayout) getContentPane().getLayout()).
        show(getContentPane(), name);
    }
  }
  
  /** Go back to last shown card
   * Will do nothing if there was not a prior card
   */
  public void goBack() {
    String last = history.get(currentCardName);
    if (last != null && last != currentCardName) {
      currentCardName = last;
      ((java.awt.CardLayout) getContentPane().getLayout()).
        show(getContentPane(), last);
    }
  }
  
  private String currentCardName;
  private java.util.HashMap<String, String> history;
  private static GUI theGUI;
}

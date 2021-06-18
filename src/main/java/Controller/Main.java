/*
 * Main.java
 */

package Controller;
import GUI.GUI;

/** Main controller for the program.
 *
 * @author Gavin
 */
public class Main {
  public static void main(String args[]) {
      GUI.getInstance().setVisible(true);
  }
  
  /** Accessor for the file location to save entries to
   * 
   *  @return saveLocation file path of folder where entries are located
   */
  public static String getSaveLocation() {
    return saveLocation;
  }
  private static String saveLocation = "F:\\Code\\Java\\DailyJournal\\Entries";
}


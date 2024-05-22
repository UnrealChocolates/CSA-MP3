public class Location {
  private int theRow;
  private int theCol;

  public Location(int r, int c) {
    theRow = r;
    theCol = c;
  }

  public int getRow() {
    return theRow;
  }

  public int getCol() {
    return theCol;
  }

  // added to see results on screen
  public String toString() {
    return theRow + " " + theCol;
  }
}

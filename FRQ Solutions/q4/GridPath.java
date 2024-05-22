import java.util.*;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  public Location getNextLoc(int row, int col) {

    boolean rightExist = true;
    boolean downExist = true;

    if (col >= grid[row].length - 1) {
      rightExist = false;
    }
    if (row >= grid[col].length - 1) {
      downExist = false;
    }
    if (rightExist && !downExist) {
      return new Location(row, col + 1);
    } else if (!rightExist && downExist) {
      return new Location(row + 1, col);
    } else {
      if (grid[row + 1][col] >= grid[row][col + 1]) {
        return new Location(row, col + 1);
      } else {
        return new Location(row + 1, col);
      }
    }
  }

  public int sumPath(int row, int col) {
    int sum = 0;
    while (!(row == grid[col].length - 1) && !(col == grid[row].length - 1)) {
      sum += grid[row][col];
      Location nextLocation = getNextLoc(row, col);
      row = nextLocation.getRow();
      col = nextLocation.getCol();
    }
    sum += grid[row][col];
    return sum;
  }

  public String toString() {
    return Arrays.deepToString(grid);
  }
}

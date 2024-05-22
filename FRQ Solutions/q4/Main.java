public class Main {
  public static void main(String[] args) {
    System.out.println("2024 AP CSA FRQ Question 4:");

    int[][] grid1 = {{12, 3, 4, 13, 5},
                     {11, 21, 2, 14, 16},
                     {7, 8, 9, 15, 0},
                     {10, 17, 20, 19, 1},
                     {18, 22, 30, 25, 6}
                    };

    GridPath test1 = new GridPath(grid1);
    System.out.println(test1);
     // PART A TESTS:
      // System.out.println(test1.getNextLoc(0, 0)); // neighbor to right
      // System.out.println(test1.getNextLoc(1, 3)); // neighbor below
      // System.out.println(test1.getNextLoc(2, 4)); // neighbor below
      // System.out.println(test1.getNextLoc(4, 3)); // neighbor to right


      int[][] grid2 = {{12, 30, 40, 25, 5},
                       {11, 3, 22, 15, 43},
                       {7, 2, 9, 4, 0},
                       {8, 33, 18, 6, 1},
                      };

      GridPath test2 = new GridPath(grid2);

      // PART B TEST:
      //System.out.println(test2.sumPath(1, 1)); // expected result: 19
  }

}

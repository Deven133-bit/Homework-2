public class GridCalculator {

    /**
     * Calculates the sum of all elements in a 2D array (grid) of doubles.
     * * This uses nested loops: the outer loop goes through each row, 
     * and the inner loop goes through each element within that row.
     *
     * @param grid The 2D array of doubles (the grid).
     * @return The sum of all elements in the grid.
     */
    public static double sumGrid(double[][] grid) {
        double totalSum = 0.0;
        
        // Outer loop: iterates over the rows of the grid
        for (int i = 0; i < grid.length; i++) {
            
            // Inner loop: iterates over the elements (columns) in the current row
            for (int j = 0; j < grid[i].length; j++) {
                // Add the current element to the running total
                totalSum += grid[i][j];
            }
        }
        
        return totalSum;
    }

    public static void main(String[] args) {
        
        System.out.println("--- Testing the sumGrid function ---");
        
        // Example 1: A 3x3 grid (3 rows, 3 columns)
        double[][] grid1 = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        double sum1 = sumGrid(grid1);
        System.out.println("\nGrid 1 Sum: " + sum1); // Expected: 45.0

        // Example 2: A non-square grid (different number of elements in each row)
        double[][] grid2 = {
            {10.5, 5.5},
            {2.0, 1.0, 0.5},
            {3.0}
        };
        double sum2 = sumGrid(grid2);
        System.out.println("Grid 2 Sum: " + sum2); // Expected: 22.5
    }
}

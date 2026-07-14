public class ArraysExercise2 {
    public static void main(String[] args) {
        String [] grandSlamWinners = {"Federer", "Nadal", "Djokovic"};
        int[] years = {2009, 2010, 2015};

        // Replace the last winner with the correct name
        grandSlamWinners[2] = "Djokovic";
         // Correct the year
         years[2] = 2023;

         System.out.println(grandSlamWinners[0] + " won in " + years[0]);
         System.out.println(grandSlamWinners[1] + " won in " + years[1]);
         System.out.println(grandSlamWinners[2] + " won in " + years[2]);
    }
    
}

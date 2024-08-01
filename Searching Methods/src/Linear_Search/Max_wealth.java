package Linear_Search;

public class Max_wealth {
    public static void main(String[] args) {
        //person = row
        //bank = col

    }
    public int Max_Wealth(int[][] wealth) {
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int person = 0;person <wealth.length;person++) {
            for (int bank = 0; bank < wealth[person].length; bank++) {
                sum += wealth[person][bank];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return sum;
    }
}

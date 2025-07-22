package ArraySeries;

public class TwoSum {
    public static void main(String[] args) {
        int []arr = {0,3,2,6};


        int target = 8;
        for(int i=0; i<arr.length; i++)
        {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i+","+j);
                    return;

                }
            }
        }
        System.out.println("No two sum solution found.");

    }
}

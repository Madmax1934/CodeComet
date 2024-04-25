package StringsPractice;

public class EqualPoint {
    public static void main(String[] args) {
        String input = "(())))(";//"((()))()()";
        int equalPointIndex = findEqualPoint(input);

        if (equalPointIndex != -1) {
            System.out.println("Equal point index: " + equalPointIndex);
        } else {
            System.out.println("No equal point found.");
        }
    }

    private static int findEqualPoint(String str) {
        /*
        int n = str.length();
        int[] prefixOpen = new int[n]; // Count of opening brackets before each index
        int[] suffixClose = new int[n]; // Count of closing brackets after each index

        // Calculate prefixOpen array
        int openCount = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                openCount++;
            }
            prefixOpen[i] = openCount;
        }

        // Calculate suffixClose array
        int closeCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == ')') {
                closeCount++;
            }
            suffixClose[i] = closeCount;
        }

        // Find equal point
        for (int i = 0; i < n; i++) {
            if (prefixOpen[i] == suffixClose[i]) {
                return i-1;
            }
        }

        return -1; // No equal point

         */
        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<str.length();i++)
        {
            if(sb.substring(0,i).chars().filter(x -> x == '(').count() ==
                    sb.substring(i+1,str.length()).chars().filter(x -> x == ')').count())
            {
                return i+1;
            }
        }
        return 0;
    }
}

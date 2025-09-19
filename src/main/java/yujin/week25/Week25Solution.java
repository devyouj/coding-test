package yujin.week25;

public class Week25Solution {
    public int[] convertBinary(String s) {
        int convertCount = 0;
        int totalRemoveZeroCount = 0;
        while(!s.equals("1")) {
            convertCount++;
            totalRemoveZeroCount += s.length() - s.replaceAll("0", "").length();
            s = Integer.toString(s.replaceAll("0", "").length(), 2);
        }
        return new int[]{convertCount, totalRemoveZeroCount};
    }
}

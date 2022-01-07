package Patterns;

public class Victory {
    public static void main(String[] args) {
        Victory obj = new Victory();
        obj.PatternProgramVictory();
    }

    public void PatternProgramVictory() {
        for (int i = 1; i <= 3; i++) {
            if (i % 3 == 0) {
                System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            } else if (i % 2 == 0) {
                System.out.println("||     victory is mine!!      ||");
            } else {
                System.out.println("///////////////////////////////");
            }
        }
    }
}

package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
   int res1=0;
   int res2=0;
    if (lastInRow<0) {
        System.out.println("last number in row is negative");}
    else if (numberToSkip>lastInRow) {
        System.out.println("number to skip is bigger then the last");}
    else {
        for (int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                res1 = res1 + i;
                continue;
            }
            res2 = res2 + i;
        }
        System.out.println("skipped sum is "+res1);
        System.out.println("counted sum is "+res2);
    }

    }
    }

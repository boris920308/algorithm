package basic;

import org.jetbrains.annotations.NotNull;

public class 다중_조건_정렬 implements Comparable<다중_조건_정렬> {

    int javaScore;
    int kotlinScore;

    public 다중_조건_정렬(int javaScore, int kotlinScore) {
        this.javaScore = javaScore;
        this.kotlinScore = kotlinScore;
    }

    @Override
    public String toString() {
        return "다중_조건_정렬{" +
                "javaScore=" + javaScore +
                ", kotlinScore=" + kotlinScore +
                '}';
    }

    @Override
    public int compareTo(@NotNull 다중_조건_정렬 o) {
        // 원하는 조건으로 return
        if (this.javaScore == o.javaScore) {
            return o.kotlinScore - this.kotlinScore;
        }
        return o.javaScore - this.javaScore;
    }
}

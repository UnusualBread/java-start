package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L05_comparable;

/*
There is an application to create leaderboards of e-sports competitions. It
uses the Score class to represent a score of each player. This class has two
fields: player for the player's name and totalScore for that player's total
score. To build a leaderboard, the Score objects need to be compared. A Score
object is considered bigger than another Score if it's totalScore value is
bigger. If totalScore values of two Score objects are the same, such objects
must be compared by their player values.
*/

import java.util.*;

class Score implements Comparable<Score> {
    private final String player;
    private final int totalScore;

    public Score(String player, int totalScore) {
        this.player = player;
        this.totalScore = totalScore;
    }

    public String getPlayer() {
        return player;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return player + '=' + totalScore;
    }

    @Override
    public int compareTo(Score score) {
        int result = Integer.compare(totalScore, score.totalScore);
        return result != 0 ? result : player.compareTo(score.player);
    }
}

class T02_ByScoreAndPlayerSorter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Score> scores = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");
            Score score = new Score(input[0], Integer.parseInt(input[1]));
            scores.add(score);
        }

        Collections.sort(scores);
        System.out.println(scores);
    }
}
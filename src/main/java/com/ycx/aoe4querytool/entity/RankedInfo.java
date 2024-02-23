package com.ycx.aoe4querytool.entity;

public class RankedInfo {
    private String name;
    private int rating;
    private int maxRating;
    private int maxRating7d;
    private int maxRating1m;
    private int rank;// 排名
    private String rankLevel;

    public RankedInfo(String name, int rating, int maxRating, int maxRating7d, int maxRating1m, int rank, String rankLevel) {
        this.name = name;
        this.rating = rating;
        this.maxRating = maxRating;
        this.maxRating7d = maxRating7d;
        this.maxRating1m = maxRating1m;
        this.rank = rank;
        this.rankLevel = rankLevel;
    }

    public RankedInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(int maxRating) {
        this.maxRating = maxRating;
    }

    public int getMaxRating7d() {
        return maxRating7d;
    }

    public void setMaxRating7d(int maxRating7d) {
        this.maxRating7d = maxRating7d;
    }

    public int getMaxRating1m() {
        return maxRating1m;
    }

    public void setMaxRating1m(int maxRating1m) {
        this.maxRating1m = maxRating1m;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getRankLevel() {
        return rankLevel;
    }

    public void setRankLevel(String rankLevel) {
        this.rankLevel = rankLevel;
    }
}

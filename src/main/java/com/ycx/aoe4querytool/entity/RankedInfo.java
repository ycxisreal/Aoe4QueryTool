package com.ycx.aoe4querytool.entity;

public class RankedInfo {
    private String modeName;
    private int season;
    private int rating;

    private int maxRating;
    private int maxRating7d;
    private int maxRating1m;
    private int rank;// 排名
    private String rankLevel;
    private int gameCount;
    private int winCount;
    private int loseCount;
    private int elo;

    public RankedInfo(String modeName, int season, int rating, int maxRating, int maxRating7d, int maxRating1m, int rank, String rankLevel, int gameCount, int winCount, int loseCount, int elo) {
        this.modeName = modeName;
        this.season = season;
        this.rating = rating;
        this.maxRating = maxRating;
        this.maxRating7d = maxRating7d;
        this.maxRating1m = maxRating1m;
        this.rank = rank;
        this.rankLevel = rankLevel;
        this.gameCount = gameCount;
        this.winCount = winCount;
        this.loseCount = loseCount;
        this.elo = elo;
    }

    public RankedInfo() {
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
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

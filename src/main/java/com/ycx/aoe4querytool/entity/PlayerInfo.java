package com.ycx.aoe4querytool.entity;

public class PlayerInfo {
    private String site;
    private String avatars;
    private String country;

    public PlayerInfo() {
    }

    public PlayerInfo(String site, String avatars, String country) {
        this.site = site;
        this.avatars = avatars;
        this.country = country;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAvatars() {
        return avatars;
    }

    public void setAvatars(String avatars) {
        this.avatars = avatars;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PlayerInfo{" +
                "site='" + site + '\'' +
                ", avatars='" + avatars + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

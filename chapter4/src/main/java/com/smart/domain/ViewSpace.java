package com.smart.domain;

import java.io.Serializable;
import java.util.List;

public class ViewSpace implements Serializable {

    protected int spaceId;
    protected String spaceName;
    protected String description;
    protected String website;
    protected String address;
    protected int wantNum;
    protected int beenNum;
    protected int notwantNum;
    protected int userId;
    protected List<ViewPoint> viewPoints;

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getDescription() {
        return description;
    }

    public String getBriefDesc() {
        if (description == null) {
            return "";
        } else {
            int len = description.length() > 100 ? 100 : description.length();
            return description.substring(0, len);
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWantNum() {
        return wantNum;
    }

    public void setWantNum(int wantNum) {
        this.wantNum = wantNum;
    }

    public int getBeenNum() {
        return beenNum;
    }

    public void setBeenNum(int beenNum) {
        this.beenNum = beenNum;
    }

    public int getNotwantNum() {
        return notwantNum;
    }

    public void setNotwantNum(int notwantNum) {
        this.notwantNum = notwantNum;
    }

    public int getUser() {
        return userId;
    }

    public void setUser(int userId) {
        this.userId = userId;
    }

    public List<ViewPoint> getViewPoints() {
        return viewPoints;
    }

    public void setViewPoints(List<ViewPoint> viewPoints) {
        this.viewPoints = viewPoints;
    }
}
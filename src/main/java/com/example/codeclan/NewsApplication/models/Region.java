package com.example.codeclan.NewsApplication.models;

public enum Region {

    SCOTLAND("Scotland"),
    NORTHWEST("North West"),
    NORTHEAST("North East"),
    YORKSHIRE("Yorkshire"),
    WALES("Wales"),
    WESTMIDLANDS("West Midlands"),
    EASTMIDLANDS("East Midlands"),
    EAST("East"),
    LONDON("London"),
    SOUTHWEST("South West"),
    SOUTHEAST("South East");

    private String region;

    Region(String region) {
        this.region = region;
    }

    public String getRegionValue() {
        return region;
    }
}

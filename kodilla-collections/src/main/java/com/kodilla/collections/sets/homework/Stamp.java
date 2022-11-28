package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampMeasure;
    private boolean isItStamped;

    public Stamp(String stampName, String stampMeasure, boolean isItStamped) {
        this.stampName = stampName;
        this.stampMeasure = stampMeasure;
        this.isItStamped = isItStamped;
    }

    public String getStampName() {
        return stampName;
    }
    public String getStampMeasure() {
        return stampMeasure;
    }
    public boolean isItSTamped() {
        return isItStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isItStamped == stamp.isItStamped && Objects.equals(stampName, stamp.stampName) && Objects.equals(stampMeasure, stamp.stampMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampMeasure, isItStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampMeasure='" + stampMeasure + '\'' +
                ", isItSTamped=" + isItStamped +
                '}';
    }
}

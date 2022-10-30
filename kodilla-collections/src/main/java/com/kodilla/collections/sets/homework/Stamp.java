package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampSize;
    private String isThereAPostmark;

    public Stamp(String stampName, String stampSize, String isThereAPostmark) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.isThereAPostmark = isThereAPostmark;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public String getIsThereAPostmark() {
        return isThereAPostmark;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", isThereAPostmark='" + isThereAPostmark + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) && Objects.equals(stampSize, stamp.stampSize) && Objects.equals(isThereAPostmark, stamp.isThereAPostmark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, isThereAPostmark);
    }
}

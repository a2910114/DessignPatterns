package com.mykhaylenko.dessign.numberincrement;

/**
 * Created by pavlo.mykhaylenko on 11/3/2015.
 */
public class PartRule {
    private String low;
    private String high;
    private boolean isDelimiter;

    public PartRule() {
    }

    public PartRule(String low, String high, boolean isDelimiter) {
        this.low = low;
        this.high = high;
        this.isDelimiter = isDelimiter;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public boolean isDelimiter() {
        return isDelimiter;
    }

    public void setIsDelimiter(boolean isDelimiter) {
        this.isDelimiter = isDelimiter;
    }
}

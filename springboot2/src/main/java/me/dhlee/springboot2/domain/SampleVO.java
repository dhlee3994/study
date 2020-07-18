package me.dhlee.springboot2.domain;

public class SampleVO {
    private String val1;
    private String val2;
    private String val3;

    @Override
    public String toString() {
        return "SampleVO{" +
                "val1='" + val1 + '\'' +
                ", val2='" + val2 + '\'' +
                ", val3='" + val3 + '\'' +
                '}';
    }

    public SampleVO() {}

    public SampleVO(String val1, String val2, String val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }

    public String getVal3() {
        return val3;
    }
}

package com.alamin.question;

import java.util.Arrays;

public class AdvanceCalculator extends Calculator{
    private int result;
    public AdvanceCalculator(int a, int b, int[] arr) {
        super(a, b);
        this.result = Arrays.stream(arr).sum()+super.sum();
    }
    @Override
    public int sum() {
        return this.result;
    }
}

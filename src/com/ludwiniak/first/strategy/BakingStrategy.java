package com.ludwiniak.first.strategy;

public interface BakingStrategy {
    String startBaking();
    void setBakingTime(int time);
    String prepareIngredients();
}

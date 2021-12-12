package com.ludwiniak.first.strategy;

public class Kitchen {
    public void makeCake(BakingStrategy bakingStrategy) {
        System.out.println(bakingStrategy.prepareIngredients());
        System.out.println(bakingStrategy.startBaking());
    }
}

package com.ludwiniak.first.strategy;

public class ApplePie implements BakingStrategy {
    private int time;

    @Override
    public String startBaking() {
        return "Początek pieczenia jabłecznika wróć za " + time + " minut";

    }

    @Override
    public void setBakingTime(int time) {
        this.time = time;
    }

    @Override
    public String prepareIngredients() {
        return "Przygotuj mąke, jabłka, kruszonkę";
    }
}

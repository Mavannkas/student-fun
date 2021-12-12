package com.ludwiniak.first.strategy;

public class CheeseCake implements BakingStrategy {
    private int time;

    @Override
    public String startBaking() {
        return "Początek pieczenia sernika wróć za " + time + " minut";

    }

    @Override
    public void setBakingTime(int time) {
        this.time = time;
    }

    @Override
    public String prepareIngredients() {
        return "Przygotuj masło, ser, rodzyni";
    }
}

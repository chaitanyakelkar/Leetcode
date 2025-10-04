class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int canDrink = 0;
        int remBottles = 0;
        while (numBottles > 0){
            canDrink += numBottles;
            numBottles += remBottles;
            remBottles = numBottles % numExchange;
            numBottles /= numExchange;
        }

        return canDrink;
    }
}
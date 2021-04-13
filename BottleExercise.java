public class BottleExercise {
    private double waterAmount;
    private double capacity;

    double getCapacity() {
        return capacity;
    }

    double getWaterAmount() {
        return waterAmount;
    }

    BottleExercise(double waterAmount, double capacity) {
        this.waterAmount = waterAmount;
        this.capacity = capacity;
    }

    double howMuchWaterToFullBottle() {
        double howMuchWater = this.capacity - this.waterAmount;
        return howMuchWater;
    }

    boolean fill (double amount) {
        if (this.capacity >= amount)
        this.waterAmount += amount;
        else return false;
        return true;
    }

    boolean pour (double amount) {
        if (this.waterAmount >= amount)
        this.waterAmount -= amount;
        else return false;
        return true;
    }

    void transferWater(double amount, BottleExercise transferToBottle) {
        if (howMuchWaterToFullBottle() >= amount) {
        this.pour(amount);
        transferToBottle.fill(amount); }
        else System.out.println("Not enough water or insufficient capacity");
    }

    public static void main(String[] args) {
        BottleExercise[] bottle = new BottleExercise[3];

        for (int i = 0; i<3; i++) {
            bottle[i] = new BottleExercise((i + 1) * 10, (i+2) * 10);
        }

        bottle[0].transferWater(2, bottle[2]);

        System.out.println(bottle[0].getWaterAmount() + " " + bottle[0].getCapacity());
        System.out.println(bottle[1].getWaterAmount() + " " + bottle[1].getCapacity());
        System.out.println(bottle[2].getWaterAmount() + " " + bottle[2].getCapacity());

    }
}

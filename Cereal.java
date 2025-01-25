public class Cereal {
    // Instance variables
    private String name;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private double carbohydrates; // Changed to double to handle decimal values
    private int sugar;
    private int potassium;
    private int vitamins;
    private double rating;

    // Constructor
    public Cereal(String name, int calories, int protein, int fat, int sodium, double fiber, double carbohydrates, int sugar, int potassium, int vitamins, double rating) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.rating = rating;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public double getFiber() {
        return fiber;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public int getSugar() {
        return sugar;
    }

    public int getPotassium() {
        return potassium;
    }

    public int getVitamins() {
        return vitamins;
    }

    public double getRating() {
        return rating;
    }

    // toString method
    @Override
    public String toString() {
        return name + " - Rating: " + rating;
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating multiple Cereal objects
        Cereal cereal1 = new Cereal("100% Bran", 70, 4, 1, 130, 10.0, 5.0, 6, 280, 25, 68.40);
        Cereal cereal2 = new Cereal("All-Bran", 120, 3, 1, 260, 9.0, 7.0, 5, 320, 25, 59.43);
        Cereal cereal3 = new Cereal("Apple Jacks", 110, 2, 1, 180, 1.5, 10.5, 10, 70, 25, 29.50);
        Cereal cereal4 = new Cereal("Cheerios", 110, 6, 2, 290, 2.0, 12.0, 12, 35, 25, 50.76);

        // Array to store cereals
        Cereal[] cereals = {cereal1, cereal2, cereal3, cereal4};

        // Finding the most and least healthy cereals based on rating
        Cereal mostHealthy = cereals[0];
        Cereal leastHealthy = cereals[0];

        for (Cereal cereal : cereals) {
            if (cereal.getRating() > mostHealthy.getRating()) {
                mostHealthy = cereal;
            }
            if (cereal.getRating() < leastHealthy.getRating()) {
                leastHealthy = cereal;
            }
        }

        // Output the results
        System.out.println("Most Healthy Cereal: " + mostHealthy);
        System.out.println("Least Healthy Cereal: " + leastHealthy);
    }
}

package model;

public class Meal {
    private String mealNumber;
    private String mealType;
    private String mealName;
    private String mealPrice;

    public Meal() {
    }

    public Meal(String mealNumber, String mealType, String mealName, String mealPrice) {
        this.setMealNumber(mealNumber);
        this.setMealType(mealType);
        this.setMealName(mealName);
        this.setMealPrice(mealPrice);
    }

    public String getMealNumber() {
        return mealNumber;
    }

    public void setMealNumber(String mealNumber) {
        this.mealNumber = mealNumber;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }
}

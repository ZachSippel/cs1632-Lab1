import java.util.ArrayList;
import java.util.HashSet;

public class IntegerFeature extends Feature {

    protected int maxValue = Integer.MIN_VALUE;
    protected int minValue = Integer.MAX_VALUE;
    protected int uniqueValueCount = 0;

    protected ArrayList<IntegerDataItem> featureDataItems;

    protected IntegerFeature() {}
    public IntegerFeature(String fName, int maxValue, int minValue, int uniqueValueCount) {

        super(fName);
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.uniqueValueCount = uniqueValueCount;

    }

    public int calcMaxValue() {

        // Checks all IntegerDataItem values to see if any are greater than the current maxValue
        for (IntegerDataItem integerDataItem : featureDataItems) {

            int value = integerDataItem.getValue();

            if (maxValue < value) {
                this.maxValue = value;
            }
        }

        return maxValue;

    }

    public int calcMinValue() {

        // Checks all IntegerDataItem values to see if any are less than the current minValue
        for (IntegerDataItem integerDataItem : featureDataItems) {

            int value = integerDataItem.getValue();

            if (minValue > value) {
                this.minValue = value;
            }
        }

        return minValue;

    }

    public int calcUniqueValues() {

        HashSet<Integer> uniqueIntegerValues = new HashSet<>();

        // Adds all unique integerDataItem values to uniqueIntegerValues
        for (IntegerDataItem integerDataItem : featureDataItems) {
            uniqueIntegerValues.add(integerDataItem.getValue());
        }

        this.uniqueValueCount = uniqueIntegerValues.size();
        return uniqueValueCount;

    }

    public int getMaxValue() { return maxValue; }
    public int getMinValue() { return minValue; }
    public int getUniqueValueCount() { return uniqueValueCount; }

    public void setMaxValue(int maxValue) { this.maxValue = maxValue; }
    public void setMinValue(int minValue) { this.minValue = minValue; }
    public void setUniqueValueCount(int uniqueValueCount) { this.uniqueValueCount = uniqueValueCount; }

}

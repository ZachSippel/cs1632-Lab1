public class IntegerFeature extends Feature {
    protected int maxValue;
    protected int minValue;
    protected int uniqueValueCount;

    protected IntegerFeature() {}
    public IntegerFeature(String fName, int maxValue, int minValue, int uniqueValueCount) {
        super(fName);
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.uniqueValueCount = uniqueValueCount;
    }

    public int calcMaxValue() {
        return maxValue;
    }

    public int calcMinValue() {
        return minValue;
    }

    public int calcUniqueValues() {
        return uniqueValueCount;
    }

    public int getMaxValue() { return maxValue; }
    public int getMinValue() { return minValue; }
    public int getUniqueValueCount() { return uniqueValueCount; }

    public void setMaxValue(int maxValue) { this.maxValue = maxValue; }
    public void setMinValue(int minValue) { this.minValue = minValue; }
    public void setUniqueValueCount(int uniqueValueCount) { this.uniqueValueCount = uniqueValueCount; }
}

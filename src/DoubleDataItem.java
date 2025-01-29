public class DoubleDataItem extends DataItem {
    protected double value;
    protected Feature featurePtr;

    protected DoubleDataItem() {}
    public DoubleDataItem(double value) {
        this.value = value;
    }

    public String showString() {
        return String.valueOf(this.value);
    }

    public double getValue() { return value; }
    public Feature getFeaturePtr() { return featurePtr; }

    public void setValue(double value) { this.value = value; }
    public void setFeaturePtr(Feature featurePtr) { this.featurePtr = featurePtr; }
}
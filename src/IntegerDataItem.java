public class IntegerDataItem extends DataItem {
    protected int value;
    protected Feature featurePtr;

    protected IntegerDataItem() {}
    public IntegerDataItem(int value) {
        this.value = value;
    }

    public String showString() {
        return String.valueOf(this.value);
    }

    public int getValue() { return value; }
    public Feature getFeaturePtr() { return featurePtr; }

    public void setValue(int value) { this.value = value; }
    public void setFeaturePtr(Feature featurePtr) { this.featurePtr = featurePtr; }
}

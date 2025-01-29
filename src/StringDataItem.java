public class StringDataItem extends DataItem {
    protected String value;
    protected Feature featurePtr;

    protected StringDataItem() {}
    public StringDataItem(String value) {
        this.value = value;
    }

    public String showString() {
        return this.value;
    }

    public String getValue() { return value; }
    public Feature getFeaturePtr() { return featurePtr; }

    public void setValue(String value) { this.value = value; }
    public void setFeaturePtr(Feature featurePtr) { this.featurePtr = featurePtr; }
}
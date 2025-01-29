import java.util.ArrayList;

public class StringFeature extends Feature {
    protected ArrayList<String> uniqueValues;
    protected int uniqueValueCount;

    protected StringFeature() {}
    public StringFeature(String fName, int uniqueValueCount) {
        super(fName);
        this.uniqueValueCount = uniqueValueCount;
    }

    // Desc: Check if value is in the uniqueValues ArrayList, return boolean
    public boolean isValueInFeature(String value) {
        return true;
    }

    public int calcUniqueValueCount() {
        return uniqueValueCount;
    }

    public int getUniqueValueCount() { return uniqueValueCount; }

    public void setUniqueValueCount(int uniqueValueCount) { this.uniqueValueCount = uniqueValueCount; }
}

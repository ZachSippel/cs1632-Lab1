import java.util.ArrayList;
import java.util.HashSet;

public class StringFeature extends Feature {

    protected int uniqueValueCount;

    protected ArrayList<StringDataItem> featureDataItems;

    protected StringFeature() {}
    public StringFeature(String fName, int uniqueValueCount) {
        super(fName);
        this.uniqueValueCount = uniqueValueCount;
    }

    // Desc: Check if String "str" is in the stringValues ArrayList, return boolean
    public boolean isValueInFeature(String str) {

        ArrayList<String> stringValues = new ArrayList<>();

        // Adds all stringDataItem values to stringValues
        for (StringDataItem stringDataItem : featureDataItems) {

            String value = stringDataItem.getValue();
            stringValues.add(value);

        }

        return stringValues.contains(str);

    }

    public int calcUniqueValueCount() {

        HashSet<String> uniqueStringValues = new HashSet<>();

        // Adds all unique stringDataItem values to uniqueStringValues
        for (StringDataItem stringDataItem : featureDataItems) {
            uniqueStringValues.add(stringDataItem.getValue());
        }

        this.uniqueValueCount = uniqueStringValues.size();
        return uniqueValueCount;

    }

    public int getUniqueValueCount() { return uniqueValueCount; }

    public void setUniqueValueCount(int uniqueValueCount) { this.uniqueValueCount = uniqueValueCount; }
}

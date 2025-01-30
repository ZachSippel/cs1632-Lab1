import java.util.ArrayList;
import java.util.Collections;

public class DoubleFeature extends Feature {

    protected double meanValue;
    protected double medianValue;
    protected double standardDeviationValue;

    protected ArrayList<DoubleDataItem> featureDataItems;

    protected DoubleFeature() {}
    public DoubleFeature(String fName, double meanValue, double medianValue, double standardDeviationValue) {
        super(fName);
        this.meanValue = meanValue;
        this.medianValue = medianValue;
        this.standardDeviationValue = standardDeviationValue;
    }

    public double calcMeanValue() {

        double valueSum = 0.0;

        // Adds all doubleDataItem values in the Feature to calculate the sum
        for (DoubleDataItem doubleDataItem : featureDataItems) {

            double value = doubleDataItem.getValue();
            valueSum += value;

        }

        this.meanValue = (valueSum / featureDataItems.size());
        return meanValue;

    }

    public double calcMedianValue() {

        ArrayList<Double> doubleValues = new ArrayList<>();
        int size;

        // Adds all doubleDataItem values to doubleValues
        for (DoubleDataItem doubleDataItem : featureDataItems) {

            double value = doubleDataItem.getValue();
            doubleValues.add(value);

        }

        Collections.sort(doubleValues);
        size = doubleValues.size();

        // Some AI used here to figure out how to calculate the median
        if (size % 2 == 1) {

            this.medianValue = doubleValues.get(size / 2);

        }
        else
        {

            double leftCenterValue = doubleValues.get((size / 2) - 1);
            double rightCenterValue = doubleValues.get(size / 2);

            this.medianValue = (leftCenterValue + rightCenterValue) / 2;

        }

        return medianValue;

    }

    // Some AI used here to figure out how to calculate the standard deviation
    public double calcStandardDeviationValue() {

        double meanValue = calcMeanValue();
        double varianceSum = 0.0;

        for (DoubleDataItem doubleDataItem : featureDataItems) {

            double value = doubleDataItem.getValue();
            varianceSum += Math.pow(value - meanValue, 2);

        }

        double variance = varianceSum / featureDataItems.size();

        this.standardDeviationValue =  Math.sqrt(variance);
        return standardDeviationValue;

    }

    public double getMeanValue() { return meanValue; }
    public double getMedianValue() { return medianValue; }
    public double getStandardDeviationValue() { return standardDeviationValue; }

    public void setMeanValue(double meanValue) { this.meanValue = meanValue; }
    public void setMedianValue(double medianValue) { this.medianValue = medianValue; }
    public void setStandardDeviationValue(double standardDeviationValue) { this.standardDeviationValue = standardDeviationValue; }

}

public class DoubleFeature extends Feature {
    protected double meanValue;
    protected double medianValue;
    protected double standardDeviationValue;

    protected DoubleFeature() {}
    public DoubleFeature(String fName, double meanValue, double medianValue, double standardDeviationValue) {
        super(fName);
        this.meanValue = meanValue;
        this.medianValue = medianValue;
        this.standardDeviationValue = standardDeviationValue;
    }

    public double calcMeanValue() {
        return meanValue;
    }

    public double calcMedianValue() {
        return medianValue;
    }

    public double calcStandardDeviationValue() {
        return standardDeviationValue;
    }

    public double getMeanValue() { return meanValue; }
    public double getMedianValue() { return medianValue; }
    public double getStandardDeviationValue() { return standardDeviationValue; }

    public void setMeanValue(double meanValue) { this.meanValue = meanValue; }
    public void setMedianValue(double medianValue) { this.medianValue = medianValue; }
    public void setStandardDeviationValue(double standardDeviationValue) { this.standardDeviationValue = standardDeviationValue; }
}

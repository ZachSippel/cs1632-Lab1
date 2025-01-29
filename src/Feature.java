public abstract class Feature {
    protected String fName;
    public String featureName() { return fName; }
    protected Feature() {}
    public Feature(String n) { fName = n; }
}
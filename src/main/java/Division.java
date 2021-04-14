public final class Division extends InputedValues implements PrintResult {
    public double count() {
        setResult(getValue1() / getValue2());
        return getResult();
    }
}

public final class Multiplication extends InputedValues implements PrintResult {
    @Override
    public double count() {
        setResult(getValue1() * getValue2());
        return getResult();
    }
}

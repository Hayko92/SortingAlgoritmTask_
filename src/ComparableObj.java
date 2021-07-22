public class ComparableObj implements Comparable<ComparableObj> {
    private int number;

    public ComparableObj(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(ComparableObj o) {
        return Integer.compare(this.number, o.getNumber());
    }

    @Override
    public String toString() {
        return "ComparableObjects{" +
                "number=" + number +
                '}';
    }
}

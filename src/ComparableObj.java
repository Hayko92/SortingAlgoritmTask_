public class ComparableObj implements java.lang.Comparable {
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
    public int compareTo(Object o) {
        return this.number - ((ComparableObj) o).getNumber();
    }

    @Override
    public String toString() {
        return "ComparableObjects{" +
                "number=" + number +
                '}';
    }
}

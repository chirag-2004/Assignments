interface Comparator1<T> {
    int compare(T a, T b);
}

class UniComparator<T> implements Comparator1<T> {

    public int compare(T a, T b) {

        // Null handling
        if (a == null && b == null) return 0;
        if (a == null) return -1;
        if (b == null) return 1;

        // Integer comparison
        if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a - (Integer) b;
        }

        // String comparison (lexicographical)
        if (a instanceof String && b instanceof String) {

            String s1 = (String) a;
            String s2 = (String) b;

            int len = Math.min(s1.length(), s2.length());

            for (int i = 0; i < len; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return s1.charAt(i) - s2.charAt(i);
                }
            }

            return s1.length() - s2.length();
        }

        throw new RuntimeException("Unsupported type");
    }
}

public class UnitCompare {
    public static void main(String[] args) {

        Comparator1<Integer> intCmp = new UniComparator<>();
        System.out.println(intCmp.compare(10, 20));

        Comparator1<String> strCmp = new UniComparator<>();
        System.out.println(strCmp.compare("ABC", "BCD"));
    }
}

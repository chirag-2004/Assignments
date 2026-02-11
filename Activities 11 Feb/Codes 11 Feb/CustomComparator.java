interface Comparator<T> {
    int compare(T a, T b);
}

class IntegerCompare implements Compar<Integer> {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}

class StringCompare implements Compar<String> {
    public int compare(String a, String b) {

        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }
}

public class CustomComparator {
    public static void main(String[] args) {

        Compar<Integer> intCmp = new IntegerCompare();
        System.out.println(intCmp.compare(10, 20));

        Compar<String> strCmp = new StringCompare();
        System.out.println(strCmp.compare("ABC", "ABC"));
    }
}

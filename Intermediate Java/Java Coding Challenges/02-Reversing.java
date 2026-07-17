class StringReverser {
    static String reverse(String toReverse) {
        String tmp = "";

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            tmp += toReverse.charAt(i);
        }
        return tmp;
    }
    public static void main(String[] args) {
        String word = "stressed";
        System.out.println(reverse(word));
    }
}
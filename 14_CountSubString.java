class Main {
    static int count(StringBuilder str, String s) {
        if (str.length() == 0 || str == null) {
            return 0;
        }

        int idx=0, c=0;

        while (true) {
            idx = str.indexOf(s);
            if (idx != -1) {
                c++;
                str.setCharAt(idx, '1');
            } else {
                break;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("1011000101010111");
        String s = "010";
        System.out.println(count(str, s));
    }
}

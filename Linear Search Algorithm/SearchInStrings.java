public class SearchInStrings {
    public static void main(String[] args) {
        String searchStr = "Rohit Tewari";
        char target = 'w';

        boolean isFound = search(searchStr, target);
        System.out.println("isFound => " + isFound);
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}

public class q3 {

    public static void main(String[] args) {
        String inputString = "hello world";
        int[] indices = getIndexArray(inputString);

        System.out.println("Alphabetical indices of characters in the string:");
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] != -1) {
                char c = (char) ('a' + i);
                System.out.println(c + ": " + indices[i]);
            }
        }
    }
    public static int[] getIndexArray(String str) {
        int[] indices = new int[26];
        for(int i=0;i<indices.length;i++){
            indices[i]=-1;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Convert to lowercase for case-insensitive sorting
                indices[c - 'a'] = i;
            }
        }

        return indices;
    }
}




public class q5 {
    public static void main(String[] args) {
        String inputString = "hello world";
        char[] secondMostFrequentChars = findSecondMostFrequentChars(inputString);

        System.out.println("Second most frequent character(s):");
        for (char c : secondMostFrequentChars) {
            System.out.println(c);
        }
    }

    public static char[] findSecondMostFrequentChars(String str) {
        int[] charCount = new int[26];
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                charCount[c - 'a']++;
            }
        }
        int maxFrequency = 0;
        int secondMaxFrequency = 0;
        for (int frequency : charCount) {
            if (frequency > maxFrequency) {
                secondMaxFrequency = maxFrequency;
                maxFrequency = frequency;
            } else if (frequency > secondMaxFrequency && frequency < maxFrequency) {
                secondMaxFrequency = frequency;
            }
        }
       StringBuilder result = new StringBuilder();
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] == secondMaxFrequency) {
                result.append((char) ('a' + i));
            }
        }
        return result.toString().toCharArray();
    }
}

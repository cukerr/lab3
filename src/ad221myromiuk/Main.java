package ad221myromiuk;

public class Main {
    public static void main(String[] args) {
        // 1. Проверка окончания строки на "ed"
        String testString1 = "walked";
        System.out.println("1. Ends with 'ed': " + endsWithEd(testString1));

        // 2. Сумма цифр в строке
        String testString2 = "abc123xyz";
        System.out.println("2. Sum of digits: " + sumDigitsInString(testString2));

        // 3. Наибольшая длина блока символов
        String testString3 = "aaBCS";
        System.out.println("3. Max length of block: " + maxLengthOfBlock(testString3));

        // 4. Вывод слов из строки
        String testString4 = "Иван Иванович Иванов";
        System.out.println("4. Words in string:");
        printWordsInString(testString4);

        // 5. Слияние двух строк поочередно
        String testString5A = "Вася";
        String testString5B = "12345678";
        System.out.println("5. Merged string: " + mergeStringsAlternately(testString5A, testString5B));
    }

    // 1. Проверка окончания строки на "ed"
    public static boolean endsWithEd(String str) {
        return str.endsWith("ed");
    }

    // 2. Сумма цифр в строке
    public static int sumDigitsInString(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    // 3. Наибольшая длина блока символов
    public static int maxLengthOfBlock(String str) {
        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        return Math.max(maxLength, currentLength);
    }

    // 4. Вывод слов из строки
    public static void printWordsInString(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // 5. Слияние двух строк поочередно
    public static String mergeStringsAlternately(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                result.append(str2.charAt(i));
            }
        }

        return result.toString();
    }
}

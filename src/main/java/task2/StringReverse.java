package task2;

public class StringReverse {
    public String reverseStringBuffer(String stringToReverse) {
        StringBuffer stringBuffer = new StringBuffer(stringToReverse);
        return stringBuffer.reverse().toString();
    }

    public String reverseStringBuilder(String stringToReverse) {
        StringBuilder stringBuilder = new StringBuilder(stringToReverse);
        return stringBuilder.reverse().toString();
    }

    public String reverseStringForLoop(String stringToReverse) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = stringToReverse.length()-1; i>=0; i--) {
            stringBuilder.append(stringToReverse.charAt(i));
        }

        return stringBuilder.toString();
    }

    public String reverseStringArray(String stringToReverse) {
        char[] reversedSequence = new char[stringToReverse.length()];

        for(int i = 0, j = stringToReverse.length()-1; i <= j; i++, j--) {
            reversedSequence[j] = stringToReverse.charAt(i);
            reversedSequence[i] = stringToReverse.charAt(j);
        }

        return String.valueOf(reversedSequence);
    }
}

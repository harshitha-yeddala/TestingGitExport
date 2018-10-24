

public static void main(){

public boolean isPalindromeUsingIntStream(String text) {
    String temp  = text.replaceAll("\\s+", "").toLowerCase();
    return IntStream.range(0, temp.length() / 2)
      .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
}
}

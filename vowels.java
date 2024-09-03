public class vowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = 0, consonantCount = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (c >= 'a' && c <= 'z') {
                consonantCount++;
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
}			

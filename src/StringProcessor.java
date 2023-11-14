import java.util.HashMap;
import java.util.Map;

public class StringProcessor {
    private String inputString;

    // Constructors
    public StringProcessor(String inputString) {
        this.inputString = inputString;
    }

    // Chuyển chuỗi sang chữ hoa
    public String toUpperCase() {
        return inputString.toUpperCase();
    }

    // Chuyển chuỗi sang chữ thường
    public String toLowerCase() {
        return inputString.toLowerCase();
    }

    // Đảo ngược trạng thái chữ (từ hoa sang thường và ngược lại)
    public String reverseCase() {
        char[] charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }

    // Tìm kiếm chuỗi con trong chuỗi
    public boolean containsSubstring(String substring) {
        return inputString.contains(substring);
    }

    // Trích xuất chuỗi con từ chuỗi
    public String extractSubstring(int startIndex, int endIndex) {
        return inputString.substring(startIndex, endIndex);
    }

    // Thay thế chuỗi con trong chuỗi
    public String replaceSubstring(String oldSubstring, String newSubstring) {
        return inputString.replace(oldSubstring, newSubstring);
    }

    // Kiểm tra xem một chuỗi có phải là chuỗi đối xứng hay không
    public boolean isPalindrome() {
        String reversedString = new StringBuilder(inputString).reverse().toString();
        return inputString.equals(reversedString);
    }

    // Đếm số lượng từ trong một chuỗi
    public int countWords() {
        String[] words = inputString.split("\\s+");
        return words.length;
    }

    // Đếm tần suất xuất hiện của mỗi ký tự trong chuỗi
    public Map<Character, Integer> characterFrequency() {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    // Getter và Setter cho thuộc tính inputString
    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    // Phương thức main để kiểm thử lớp StringProcessor
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor("level");

        System.out.println("Is Palindrome: " + processor.isPalindrome());
        System.out.println("Number of Words: " + processor.countWords());
        System.out.println("Character Frequency: " + processor.characterFrequency());
    }
}

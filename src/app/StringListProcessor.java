package app;

public class StringListProcessor {
    public static int countUppercase(String string) {
        return (int) string.chars()
                .filter(Character::isUpperCase)
                .count();
    }
}

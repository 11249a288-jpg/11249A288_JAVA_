public class Main {
    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replace: " + str.replace("Java", "World"));
        System.out.println("Concatenation: " + str + " Programming");
        StringBuilder sb = new StringBuilder(str);
        sb.append(" Course");
        System.out.println("Append: " + sb);
    }
}
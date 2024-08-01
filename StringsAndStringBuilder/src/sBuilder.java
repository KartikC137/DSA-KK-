public class sBuilder {
    public static void main(String[] args) {
        StringBuilder example = new StringBuilder();
        for(int i= 0;i<26;i++){
            char ch = (char)('a' + i);
            example.append(ch);
        }
        System.out.println(example);
    }
}

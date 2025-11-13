public class ConvertDemo {
    public static void main(String[] args) {

        String str = "Hello";

        // String → SB, SBF
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sbf = new StringBuffer(str);

        // SB → String
        String str1 = sb.toString();

        // SBF → String
        String str2 = sbf.toString();

        // SB → SBF
        StringBuffer sbf2 = new StringBuffer(sb.toString());

        // SBF → SB
        StringBuilder sb2 = new StringBuilder(sbf.toString());
    }
}


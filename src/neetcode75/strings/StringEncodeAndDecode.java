package neetcode75.strings;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class StringEncodeAndDecode {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            byte[] utf8Bytes =  s.getBytes();
            sb.append(utf8Bytes.length).append('#').append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String str){
        List<String> decodedStrings = new ArrayList<>();

        int i=0;
        while (i<str.length()){
            int j=i;
            while (str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i=j+1;
            String word = str.substring(i, i+len);
            decodedStrings.add(word);
            i=i+len;
        }
        return decodedStrings;
    }

    public static void main(String[] args) {
        StringEncodeAndDecode codec = new StringEncodeAndDecode();

        List<String> input = Arrays.asList("hello", "🚀rocket", "");

        String encoded = codec.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}

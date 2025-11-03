package other;


public class LargeNumberRev {
    public static void main(String[] args) throws Exception{
        int num=32634934;
        Integer finalValue;
        String str = num+"";
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=chars.length-1;i>=0;i--){
            sb=sb.append(chars[i]);
        }
        try {
            finalValue  = Integer.parseInt(sb.toString());
        }catch (Exception e){
            throw new Exception();
        }
        System.out.println("Reversed Value is:"+finalValue);
    }

}

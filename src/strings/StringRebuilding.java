package strings;

import java.util.Locale;

public class StringRebuilding {
    public static void main(String[] args) {
        String strs = "ThiS NeeDs TO bE conVerTeD to cameL CaSE";
        strs = strs.toLowerCase();
        String[] values = strs.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<values.length;i++){
            String temp=values[i];
            if(i==values.length-1){
                temp=temp.substring(0,1).toUpperCase()+temp.substring(1, temp.length());
                stringBuilder.append(temp);
            }
            else if (i>0) {
                temp=temp.substring(0,1).toUpperCase()+temp.substring(1, temp.length());
                stringBuilder.append(temp).append("_");
            } else {
                stringBuilder.append(temp).append("_");
            }

        }

        System.out.println("Changed Case to camel_case:"+stringBuilder);
    }
}

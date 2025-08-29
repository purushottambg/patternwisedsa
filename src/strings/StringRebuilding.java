package strings;

public class StringRebuilding {
    public static void main(String[] args) {
        String strs = "ThiS NeeDs TO bE conVerTeD to SMalL LetTerS";
        strs = strs.toLowerCase();
        String[] values = strs.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<values.length;i++){
            if(i==values.length-1) stringBuilder.append(values[i]);
            else {
                stringBuilder.append(values[i]).append("_");
            }

        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание № 1:
        System.out.println("Задание № 1:");
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,-2,3,17,4,8,-6)
        );

        Integer varMax = numbers.stream()
                .filter(x ->x%2==0)
                .max(Integer::compare)
                .get();
        System.out.println("Максимальное из четных:" + varMax);

        //Задание № 2:
        System.out.println('\n' + "Задание № 2:");
        String stroke = "Привет, Александр, с праздником, с Новым Годом";
        String[] strArr = stroke.split(" ");
        String strokeOut = "";
        int i =0;
        for ( String item : strArr) {
            if (item.length()>1) {
                if (item.charAt(0) == item.toUpperCase().charAt(0)) {
                    strokeOut += item.toLowerCase().charAt(0) + item.toUpperCase().substring(1) + " ";
                }else{
                    strokeOut += item.toUpperCase().substring(0) + " ";
                }
            } else {
                strokeOut += item.toUpperCase().charAt(0)+" ";
            }
        }
        System.out.println(strokeOut);
    }
}
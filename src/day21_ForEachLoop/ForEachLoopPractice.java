package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {


        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        // print first and last character of each element in array
        for (String each : words) {
            System.out.println(each.charAt(0) + "" + each.charAt(each.length()-1));
        }


    }
}

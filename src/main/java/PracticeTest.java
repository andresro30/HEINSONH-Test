import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeTest {

    public static void main(String[] args) {
        int[] values = new int[]{1,0,1,0,0,0,1,1};
        System.out.println(firstExercise(values,1));
    }

    public static ArrayList<Integer> firstExercise(int[] values, int numPermutation){
        ArrayList<Integer> answer = new ArrayList<>();
        int size = values.length;

        //Normal
        for(int i = 0; i<size; i++) {
            int newVal = 0;
            if(i == 0){
                newVal = getPermutation(0,values[i+1]);
            }
            else if(i == size -1){
                newVal = getPermutation(values[i-1],0);
            }
            else{
                newVal = getPermutation(values[i-1],values[i+1]);
            }
            answer.add(newVal);
        }

        //Pasar a programación funcional
        //IntStream.range(0,values.size())
        //        .forEach(index -> permutation(index,values.get(index)));
        return answer;
    }

    private static int getPermutation(int pre, int pos) {
        if(pre == pos){
            return 0;
        }
        else{
            return 1;
        }
    }

    private int permutation(int index, Integer integer) {
        int number = 0;

        return number;
    }
}

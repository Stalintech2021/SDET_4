import org.testng.annotations.Test;

public class CharOccurence {

    @Test
    public void countOccurence(){

        checkOccurences("check");

    }

    public void checkOccurences(String data){

        char[] input = data.toCharArray();

        int[] iterator = new int[input.length];

        for(int i=0;i<=input.length;i++){
            iterator[i]=1;
            for(int j=i+1;j<input.length-1;j++){

                if(input[i] == input[j]){
                    iterator[i]++;

                }
            }
        }
        System.out.println(iterator);

    }


}

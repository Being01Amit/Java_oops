package Practice.OperationOnArrays;

public class ReverseArray {
    public static void main(String[] args){

        int[] ch = {1,2,3,4,5,6,7,8,9};
        int start = ch[0];
        int end = ch.length-1;
        reverseArray(ch,start,end);
        printArray(ch);

    }
/*  In this function we are reverse the arrays with the help of the swap function and swap the start value with the end value and moving to next index*/
    public static void reverseArray(int[] ch,int start, int end){
        int temp;

        for (start = 0; start < end; start++, end--){
            temp = ch[start];
            ch[start]= ch[end];
            ch[end] = temp;
        }

    }

    public static void printArray(int[] ch){
        for(int i=0; i < ch.length; i++){
            System.out.print(ch[i]+" ");
        }
    }

}

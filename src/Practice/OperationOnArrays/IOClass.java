package Practice.OperationOnArrays;
import java.io.*;
public class IOClass {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                // In this line of code we are giving the path where can machine can create a file and do write operation tht file
                new FileWriter("/home/being01amit/Desktop/Test Inputs/Output.txt/"));

        // here we are callling the Buffer Writer object and do some write function on it
        bw.write("Amit ");
        bw.write("Akshit Sharma");

        // CLosing the buffer Writer so this object no longer take input or write function
        bw.close();

        BufferedReader br = new BufferedReader(
                new FileReader("/home/being01amit/Desktop/Test Inputs/Output.txt/")
        );
/* In this Line of the Code we are storing the Buffer Reader input into String variable and printing them accordingly   */
        String s;
       // In this while we are runnig the loop until the loop reach the last input
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        // in this line of code we are closing the Buffer Reader Object
        br.close();

    }

}

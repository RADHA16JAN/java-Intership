import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.util.Objects.hash;

public class BucketSort extends Sort {
    public BucketSort() {
    }

    public int[] sort(int[] inputElements) {
     int n=inputElements.length;
//creating a list of buckets for storing lists
        List<Integer>[] buckets = new List[n];
// Linked list with each bucket array index as there may be hash collision
        for(int i = 0; i <n; i++) {
            buckets[i] = new LinkedList<>();
        }
//calculate the hash and assigns elements to the proper bucket
        for(int num : inputElements) {
            buckets[hash(num, n)].add(num);
        }
//iterate over the buckets and sorts the elements
        for(List<Integer> bucket : buckets) {
//sorts the bucket
            Collections.sort(bucket);
        }
        int index = 0;
//gethered the buckets after sorting
        for(List<Integer> bucket : buckets) {
            for(int num : bucket){
                inputElements[index++] = num;
            }
        }

        return inputElements;
    }

    private static int hash(int num, int n)
    {
        return num/n;
    }
    public void sort(String inputFile, String outputFile) {
        try {
            BufferedReader reader=new BufferedReader(new FileReader(inputFile));
            String line=reader.readLine();
            reader.close();

            String [] element=line.split(" ,");
            int [] inputElement=new int[element.length];

            for(int i=0;i<=element.length-1;i++){
                inputElement[i]=Integer.parseInt(element[i].trim());
            }

            int [] sortElement=sort(inputElement);

            FileWriter writer=new FileWriter(outputFile);
            for(int i=0;i<sortElement.length;i++){
                writer.write(String.valueOf(sortElement[i]));
                if(i<sortElement.length-1){
                    writer.write(",");
                }
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import com.ultronicsystems.library.sort.InsertionSort;
import com.ultronicsystems.library.sort.MergeSort;
import com.ultronicsystems.library.textprocessing.LineByLineRegex;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {-3,4-5,2,-4,-56,-90,-2,-5,2,6,8,9,5,4,3,6,8,9,7,90,3,6,8,9,43,34,56,76,34,2,546,78,4};
        //int[] myArray = {1,5,3,3,8,4,5,6,7,7,7,8,9,23,34,54,34};


        //QuickSort.quickSort(gayArray,0,gayArray.length-1);
        //CountingSort.countingSort(gayArray);
        //MergeSort.mergeSort(gayArray);
        //InsertionSort.insertionSort(gayArray);

        //IntegersInRange.integersInRange(gayArray,2,6);
        //LineByLineRegex utility = new LineByLineRegex();
        //utility.removeDuplicates("chars.txt");
        //utility.reverseCommaNames("chars.txt");
        //utility.stripPatternRemoveDupes("(^\\W)","chars.txt");
        //utility.sortTextFile("chars.txt");

        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i] + " ");
        }


    }







}

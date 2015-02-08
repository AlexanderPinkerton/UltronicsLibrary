import com.ultronicsystems.library.search.BinarySearch;
import com.ultronicsystems.library.sort.QuickSort;

/**
 * Created by Ace on 2/3/15.
 */
public class SumExistsSeach {

    public static void main(String[] args) {

        int[] myArray = {-3,4-5,2,-4,-56,-90,-2,-5,2,6,8,9,5,4,3,6,8,9,7,90,3,6,8,9,43,34,56,76,34,2,546,78,4};
        int targetSum = 8;



        //Sort the array for binary search. This process takes Theta(n log n)
        QuickSort.quickSort(myArray, 0, myArray.length - 1);

        boolean found = false;
        int foundIndex = -1, matchingIndex = -1;

        //For each element in the array, preform a binary search for its matching component that will equal target sum.       Theta ( n log n )
        //Break out of loop if a match is found i.e "Exists"
        for(int i=0;i<myArray.length && !found;i++){

            //Preform Binary Search for a matching number that would sum up to the target based off of n     Theta ( n log n)
            int  searchResults = BinarySearch.binarySearch(myArray, targetSum - myArray[i]);

            //If a match has been found, save the two indexes
            if(searchResults != -1){
                found = true;
                matchingIndex = searchResults;
                foundIndex = i;
            }
        }


        if(found){
            //Output the two sumbers that sum to target
            System.out.println("Indexes " + foundIndex + " and " + matchingIndex + " will produce the target sum.");
            System.out.println(myArray[foundIndex] + " " + myArray[matchingIndex]);
        }else{
            //No suming pairs found.
            System.out.println("fuggetaboutit");
        }

        //Print out the array for fun.
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i] + " ");
        }


    }
}

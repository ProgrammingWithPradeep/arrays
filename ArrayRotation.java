import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

static int[] arr={1,2,3,4,5,6,7};

public void arrayRotation(int[] arr, int rotateByNumberofPositions)
{
    int temp;
    // Handling if position value greater than the number of integers in the array.
    if(rotateByNumberofPositions>arr.length){
        rotateByNumberofPositions=rotateByNumberofPositions- arr.length;
    }
    for(int i=0;i<rotateByNumberofPositions;i++)
    {
        temp=arr[0];
        for(int j=0;j<arr.length-1;j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length-1]=temp;
    }
        System.out.print(" AFTER ARRAY ELEMENTS : " + Arrays.toString(arr));
}

        public static void main(String[] args) {
            int noOfPositions;
            ArrayRotation arrayRotation = new ArrayRotation();
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Specify the number of positions to be rotated to left");
            noOfPositions = Integer.parseInt(myObj.nextLine());  // Read user input
            // Handle Negative values
            while (noOfPositions < 0 ) {
                System.out.println("Specify a number greater than 0.Please reenter !");
                noOfPositions = Integer.parseInt(myObj.nextLine());
            }
                System.out.println("Rotating left by : " + noOfPositions + " Positions");  // Output user input

                arrayRotation.arrayRotation(arr, noOfPositions);

        }

    }





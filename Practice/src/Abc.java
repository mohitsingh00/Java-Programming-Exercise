import java.util.Random;
class Abc
{
      public static void main(String[]args)
       {
             Random ran = new Random();
             int[] num = new int[10];
         
             for(int i = 0; i < num.length; i++)
             {
                 num[i] = ran.nextInt(100);
             }
       
             System.out.println("Before:");
             printArray(num);
 
             mergeSort(num);
             System.out.println();
 
             System.out.println("\nAfter:");
             printArray(num);
       }

     private static void mergeSort(int[] inputArray)
      {
           int arrLength = inputArray.length;

           if(arrLength < 2)
           {
                 return;
           }
           int midIndex = arrLength/2;
           int[] leftHalf = new int[midIndex];
           int[] rightHalf = new int[arrLength - midIndex];

           for(int i = 0; i < midIndex; i++)
           { 
                leftHalf[i] = inputArray[i];
           }
 
           for(int i = midIndex; i < arrLength; i++)
           {
                rightHalf[i - midIndex] = inputArray[i];
           }
           mergeSort(leftHalf);
           mergeSort(rightHalf);
           merge(inputArray, leftHalf, rightHalf);
      }

     private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf)
      {
           int leftSize = leftHalf.length;
           int rightSize = rightHalf.length;
           int i = 0, j = 0, k = 0;

           while(i < leftSize && j < rightSize)
           {
                 if(leftHalf[i] < rightHalf[j])
                 {
                      inputArray[k] = leftHalf[i];
                      i++;
                 }
                else
                {
                      inputArray[k] = rightHalf[j];
                      j++;
                }
               k++;
           }
           while(i < leftSize)
           {
               inputArray[k] = leftHalf[i];
               i++;
               k++;
           }
          while(j < rightSize)
          {
              inputArray[k] = rightHalf[j];
              j++;
              k++;
          } 
      }

     private static void printArray(int [] num)
      {
            for(int i = 0; i < num.length; i++)
             {
                  System.out.print(num[i]+"  ");
             }
      }
}
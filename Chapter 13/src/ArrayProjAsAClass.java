//	AS A CLASS ARRAY 
//Array project... You are to fill in all the code for each of the methods
//below and write a method call in the main() that will test each method...


public class ArrayProjAsAClass
{
  public static void main(String args[]) 
  {
    System.out.println("ArrayProj\n");
    
    int scores[] = { 92, 88, 84, 99, 67, 85, 44, 77 };

    arrayPrint(scores);// void method ..

    System.out.println("Sum of scores is " + arraySum(scores));
    System.out.println("Avg of scores is " + arrayAvg(scores));
    System.out.println("Max of scores is " + arrayMax(scores));
    System.out.println("scores after arrayReverse: ");
    arrayReverse(scores);
    arrayPrint(scores);
    System.out.println("scores after arrayShiftLeft: ");
    arrayShiftLeft(scores,100);
    arrayPrint(scores);
    if(arrayHasDuplicates(scores))
    	System.out.println("There are duplicate scores");
    else
    	System.out.println("There are no duplicate scores");
    
//    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

  } // end main()


//prints all the elements of a on one line then prints a new line 
  public static void arrayPrint(int a[]) 
  {
	  for(int i=0; i<a.length; i++)
	  {
		  System.out.print(a[i]);
		  System.out.print(" ");
	  }
	  System.out.println();
  }
  
//***********************************************************************

// returns the sum of all the elements in array a
  public static int arraySum(int a[]) 
  {
	  int total = 0;
	  for(int x: a)
	  {
		  total += x;
	  }
	  return total;
  }
  
//***********************************************************************

// returns the average of all the elements in array a
// HINT: arrayAvg returns a double !!!!!!!
//  you may call method arraySum)
  public static double arrayAvg(int a[]) 
  {
	  return (double)arraySum(a)/a.length;
  }
  
//***********************************************************************
 
//returns the maximum value of all the elements in array a
  public static int arrayMax(int a[]) 
  {
	  int max = a[0];
	  for(int i=1;i<a.length;i++)
	  {
		  max = Math.max(max, a[i]);
	  }
	  return max;
  }
  
//***********************************************************************
  
//replace a[x] with a[y] and replace a[y] with a[x] you will need to use int
//temp as a temporary variable to hold the value a[x] as you assign a[y] to a[x]
  public static void swap(int a[], int x, int y) 
  {
	  int temp = 0;
	  temp = a[x];
	  a[x] = a[y];
	  a[y] = temp;
  }
  
//***********************************************************************
 
//physically reverses the elements in an array
//(you may call the swap method)  DO NOT JUST PRINT IT BACKWARDS 
  public static void arrayReverse(int a[]) 
  {
	  for(int i=0; i<a.length/2; i++)
	  {
		  swap(a, i, a.length-i-1);
	  }
  }

//***********************************************************************
 
//physically shifts the elements in a[] to the left and assigns the value x
//to the last element of a[] (so the value in a[0] will be overwritten)
  public static void arrayShiftLeft(int a[], int x) 
  {
    for(int i=0; i<a.length-1; i++)
    {
    	a[i]=a[i+1];
    }
    a[a.length-1] = x;
  }

//***********************************************************************
 
//returns true if any element occurs twice or more in a[]... false if all
//elements are unique
  public static boolean arrayHasDuplicates(int a[]) 
  {
    for(int i=0; i<a.length-1; i++)
    {
    	for(int j=i+1; j<a.length; j++)
    	{
    		if(a[j] == a[i])
    			return true;
    	}
    }
    return false;
  }

} 


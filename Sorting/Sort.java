public class Sort
{
  public static void QuickSort( int[] A, int start, int end )
  {
    if( start < end ) // if there is more than one element in the array
    {
      int p = Partition( A, start, end ); // find the pivots position
      QuickSort( A, start, p - 1 );
      QuickSort( A, p + 1, end );
    }
  }

  static int Partition( int[] A, int s, int e )
  {
    // i is the pointer that finds the pivots correct position
    // j is just an interator through the array
    // pivot is what's being compared too

    int i = s, pivot = A[e], temp;
    for( int j = s; j < e; j++ )
    {
      if( A[j] <= pivot )
      {
        temp = A[j];
        A[j] = A[i];
        A[i] = temp;
        i++;
      }
    }
    temp = A[i];
    A[i] = A[e];
    A[e] = temp;

    return i;
  }

  public static void InsertionSort( int[] A, int size )
  {
    int i, j, temp;
    for( i = 1; i < size; i++ )
    {
      j = i;
      while( j > 0 && A[j-1] > A[j] )
      {
        temp = A[j-1];
        A[j-1] = A[j];
        A[j] = temp;

        j -= 1;
      }
    }
  }
}

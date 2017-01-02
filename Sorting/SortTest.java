import java.io.*;

public class SortTest
{
  static int size = 50;

  public static void main( String[] args )
  {
    int[] A = ReadInput();

    System.out.println( "QuickSort" );
    System.out.println( "Before: ");
    for( int i = 0; i < size; i++ )
      System.out.print( Integer.toString( A[i] ) + " " );
    System.out.println();

    Sort.QuickSort( A, 0, size - 1 );

    System.out.println( "After: ");
    for( int i = 0; i < size; i++ )
      System.out.print( Integer.toString( A[i] ) + " " );
    System.out.println();
  }

  public static int[] ReadInput()
  {
    String[] splitValues = null;
    BufferedReader input = new BufferedReader( new InputStreamReader( System.in ));
    int[] array = new int[size];

    try
    {
      splitValues = input.readLine().split(",");
      for( int i = 0; i < size; i++ )
        array[i] = Integer.parseInt( splitValues[i].trim() );

    }

    catch( Exception e )
    {}

    return array;
  }

  static int[] CopyArray( int[] array, int size )
  {
    int[] copy = new int[size];
    for( int i = 0; i < size; i++ )
      copy[i] = array[i];

    return copy;
  }
}

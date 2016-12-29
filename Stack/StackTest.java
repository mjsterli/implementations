import java.io.*;

public class StackTest
{
  public static void main( String[] args )
  {
    String s = "";
    Stack stack = new Stack( 50 );
    BufferedReader input = new BufferedReader( new InputStreamReader( System.in ));

    try
    {
      s = input.readLine();
    }

    catch( Exception e )
    {}

    String[] parts = s.split(",");
    for( int i = 0; i < parts.length; i++ )
    {
      stack.Push( Integer.parseInt( parts[i].trim() ) );
      System.out.println( "Pushed: " + parts[i].trim() );
    }

    System.out.println("");

    while( !stack.IsEmpty() )
    {
      int pop = stack.Pop();
      System.out.println( "Popped: " + Integer.toString(pop) );
    }
  }
}

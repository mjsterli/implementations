import java.io.*;

public class BTreeTest
{
  public static void main( String[] args )
  {
    BTree tree = new BTree();
    String s = "";
    BufferedReader input = new BufferedReader( new InputStreamReader( System.in ));

    try
    {
      s = input.readLine();
    }

    catch( Exception e )
    {}

    String[] items = s.split(",");
    for( int i = 0; i < items.length; i++ )
    {
      System.out.println(items[i].trim());
      tree.AddNode( Integer.parseInt( items[i].trim() ) );
    }
    System.out.print( "PreOrder: " );
    PreOrder( tree.Root );
    System.out.println();

    System.out.print( "InOrder: " );
    InOrder( tree.Root );
    System.out.println();

    System.out.print( "PostOrder: " );
    PostOrder( tree.Root );
    System.out.println();

  }

  static void PreOrder( Node n )
  {
    if( n != null )
    {
      System.out.print( Integer.toString( n.Key ) + " " );
      PreOrder( n.Left );
      PreOrder( n.Right );
    }
  }

  static void InOrder( Node n )
  {
    if( n != null )
    {
      InOrder( n.Left );
      System.out.print( Integer.toString( n.Key ) + " " );
      InOrder( n.Right );
    }
  }

  static void PostOrder( Node n )
  {
    if( n != null )
    {
      PostOrder( n.Left );
      PostOrder( n.Right );
      System.out.print( Integer.toString( n.Key ) + " " );
    }
  }
}

public class BTree
{
  public Node Root;

  public BTree()
  {
    Root = null;
  }

  public void AddNode( int value )
  {
    if( Root == null )
      Root = new Node( value );
    {
      if( value < Root.Key )
        Root.Left = AddNode( value, Root.Left );
      else
        Root.Right = AddNode( value, Root.Right );
    }
  }

  private Node AddNode( int value, Node nodeToCompare )
  {
    if( nodeToCompare == null )
      return new Node( value );
    else
    {
      if( value < nodeToCompare.Key )
        nodeToCompare.Left = AddNode( value, nodeToCompare.Left );
      else
        nodeToCompare.Right = AddNode( value, nodeToCompare.Right );

      return nodeToCompare;
    }
  }
}

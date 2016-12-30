public class BTree
{
  public Node Root;

  public BTree()
  {
    Root = null;
  }

  public void AddNode( Node node )
  {
    if( Root == null )
      Root = node;
    else
    {
      if( node.Key < Root.Key )
      {
        AddNode( node, Root.Left );
        System.out.println( "Left: "+Integer.toString( Root.Key ) );
      }
      else
      {
        AddNode( node, Root.Right );
        System.out.println( "Right: "+Integer.toString( Root.Key ) );
      }
    }
  }

  private void AddNode( Node nodeToAdd, Node nodeToCompare )
  {
    if( nodeToCompare == null )
      nodeToCompare = nodeToAdd;
    else
    {
      if( nodeToAdd.Key < nodeToCompare.Key )
        AddNode( nodeToAdd, nodeToCompare.Left );
      else
        AddNode( nodeToAdd, nodeToCompare.Right );
    }
  }
}

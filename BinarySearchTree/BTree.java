public class BTree
{
  public Node Root;

  public BTree()
  {
    Root = null;
  }

  public void AddNode( Node node )
  {
    if( node.Key < Root.Key )
      AddNode( node, Root.Left );
    else
      AddNode( node, Root.Right );
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

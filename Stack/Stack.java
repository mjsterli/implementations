public class Stack
{
  int top;
  int[] items;

  public Stack( int max )
  {
    top = -1;
    items = new int[max];
  }

  public void Push( int item )
  {
    if( top != items.length - 1 )
      items[++top] = item;
  }

  public int Pop()
  {
    if( top >= 0)
      return items[top--];
    else
      return 0;
  }

  public void EmptyStack()
  {
    top = -1;
  }

  public int Peek()
  {
    if( top >= 0 )
      return items[top];
    else
      return 0;
  }

  public boolean IsFull()
  {
    return ( top == items.length - 1 );
  }

  public boolean IsEmpty()
  {
    return ( top == -1 );
  }
}

	public static int getHeight(Node root){
        
       return height(root)-1;
       
    }
public static int height(Node root)
{
    if (root == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = height(root.left);
            int rDepth = height(root.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth +1 );
             else
                return (rDepth +1);
        } 
}





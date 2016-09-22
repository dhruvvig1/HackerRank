   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       if(root==null){
           return -1;
       }else{
       int heightLeft=height(root.left);
           int heightRight=height(root.right);
           if(heightLeft>=heightRight){
               return heightLeft+1;
           }else{
               return heightRight+1;
           }
       }
         
    }

   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      // System.out.println(height(root));
      for(int i=0;i<=height(root);i++){
          printGivenLevelTree(root,i);
      }
      
    }
int height(Node root){
    if(root==null){
        return 0;
    }
    
    int lh=height(root.left);
    int rh=height(root.right);
    
    if(lh>rh){
        return lh+1;
    }else{
        return rh+1;
    }
}

void printGivenLevelTree(Node root, int i){
    if(root==null){
        return;
    }
    if(i==1){
        System.out.print(root.data+ " ");
    }else if (i>1){
        printGivenLevelTree(root.left,i-1);
        printGivenLevelTree(root.right,i-1);

    }
    
}

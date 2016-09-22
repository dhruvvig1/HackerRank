/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
    // System.out.println(root.right.data);
    StringBuilder sb=new StringBuilder();
    char[] st=S.toCharArray();
    Node crr=root;
    for(int i=0;i<st.length;i++){
        if(Character.getNumericValue(st[i])==1){
            crr=crr.right;
              }else
            crr=crr.left;
        
        if(crr.right==null&&crr.left==null){
            sb.append(crr.data);
            crr=root;
        }
    
    }
    System.out.print(sb);
        

       
    }

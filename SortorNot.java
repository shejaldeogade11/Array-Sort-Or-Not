public class SortorNot {
    public static void  main(String[] args) {
        int a[]={1,2,2,3,3,4,6,4,6};
      sort(a);
        
    }
    public static void  sort(int a[] ) {
        // for(int i=0;i<a.length;i++){
        //   for(int j=1;j<a.length;j++){
        //     if(a[i] >a[j])
        //     return false;
        // }  
        // }
        // return true;
 
        // for(int i=0;i<a.length;i++){
        //     if(a[i] >a[i+1])
        //     return false;
        // }
        //return true;
        int arr[] = new int[6];
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length-1;j++){
            if(a[j]==0 && a[j+1]!=0){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
           
           }
        }
        for(int i=0;i<a.length;i++){
System.out.println(a[i]);
    }

    }
}

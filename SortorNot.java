public class SortorNot {
    public static void  main(String[] args) {
        int a[]={1,2,2,3,3,4,6,4,6};
      sort(a);
        
    }
    public static void  sort(int a[] ) {
         for(int i=0;i<a.length;i++){
           for(int j=1;j<a.length;j++){
            if(a[i] >a[j])
            return false;
         }  
         }
         return true;

    }
}

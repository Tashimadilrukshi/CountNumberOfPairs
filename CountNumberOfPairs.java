import java.util.Scanner;

class CountNumberOfPairs{

  public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        System.out.println();
        
        int[] ar=new int[n];
        for(int i=0; i<ar.length; i++){
            ar[i]=s.nextInt();
        }
        System.out.println();
        
        int result = countNumberOfPairs(ar);
        
        System.out.println( result );
    }

    static int countNumberOfPairs( int[] ar) {

        int k ,temp,j ;
        
        for(int i=1;i<ar.length;i++){
            k=ar[i];
            j=i-1;
            while(j>=0 && k<ar[j]){
               
                    temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                j--;
            }
        }
        
        int count=1,tot=0;
        for(int i=0; i<ar.length-1 ; i++){
            
            if(ar[i]==ar[i+1]){
                count+=1;
            }else{
                tot+=count/2;
                count=1;
            }
        }
        tot+=count/2;
        
        return tot;
        
        
        

    }



}

import java.util.Random;

public class BinarySearchTree
{
public void take(int A[],int n)
{
int i, ran;
Random rn = new Random();
  
for(i=0; i<n; i++)
{
ran = rn.nextInt(99)+1;
A[i]=ran;
}
}



public  int[] bstSort(int[] t){
	  int[] tx = new int[3000];
	  for(int i = 0; i < tx.length; i++)	//sets all values of tx to -1
		  tx[i] = -1;
	  
	  for(int i = 0; i < t.length; i++){	//runs through all values of input array
		  int whileCnt = 0;
		  while(tx[whileCnt] != -1){	//fills tx with values from t in the proper format
			  if(t[i] < tx[whileCnt])
				  whileCnt = 2*whileCnt + 1;
			  else
			   whileCnt = 2 * whileCnt +2;
		  }
		  tx[whileCnt] = t[i];
	  }
	  return tx;
	 }


public void display(int X[],int n){
	for(int i=0;i<n;i++)
		System.out.print(X[i]+" ");
}
}
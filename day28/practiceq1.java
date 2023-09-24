
 class practiceq1
{
	public static void main(String[] args) {
		int arr[]={1,2,3,1};
		int k=1;
		int count =0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==k){
		        count++;
		    }
		    
		    }
		    if (count>=2){
		        System.out.println("True");
		    }
		    else{
		        System.out.println("False");
		    }
		}
		
	}


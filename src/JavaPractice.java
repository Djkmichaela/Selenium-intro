
public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numbers[] = {1,2,4,6,8};
		    
		    for(int i=0; i< numbers.length; i++){
		        
		        if(i==0 || i== numbers.length -1) {
		        System.out.println(numbers[i]);
		        }
		    }
		    
		    for(int i= numbers.length-1; i>=0; i--){
		        
		        System.out.println(numbers[i]);
		    }
		    
		    int total =0;
		    
		    for(int num :numbers){
		        total += num;
		        
		     
		    }
		    System.out.println(total);
	}

}

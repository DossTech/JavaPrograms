public
package org.programs;

public class ArrayFre {
    public static void main(String[] args) {  
	        //Initialize array  
	        int [] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};  
	   	        //Empty array
	        int[] emp = new int [arr.length];
	        
	        int visi = -1;
	        for (int i = 0; i < arr.length; i++) {
				
				int count=1;
	        	for (int j = i+1; j < arr.length; j++) {
				
					
	        		if (arr[i]==arr[j]) {
						count++;
						emp[j]=visi;
					}
	        		}
	        	if (emp[i]!=visi) 
					
	        		emp[i]=count;
	        		
				}
			
	      
				System.out.println("-----------------------------------");
				System.out.println("Values"+" |"+"Times");
				System.out.println("-----------------------------------");
				  for (int i = 0; i < arr.length; i++) {
					  if (emp[i]!=visi) 
							System.out.println(arr[i]+"|"+emp[i]);
					
			
			}
				  System.out.println("-----------------------------------------");
	    }
}{

}
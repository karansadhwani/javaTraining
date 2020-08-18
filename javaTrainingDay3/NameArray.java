import java.util.Arrays;
import java.util.Collections;


interface NameArrayOperation{
	void add(String name);
	boolean delete (String name);
	boolean search(String name);
	void list();
}

interface SortOperation{
	void AscendingOrder();
	void DescendingOrder();
	
}



 class Name implements NameArrayOperation,SortOperation
 {
	
	private String[] names;
	
	public Name(int size){
	
		names=new String[size];
	}
	
	public void add(String name){
		
		for(int index=0 ; index<names.length ; index++){
			if(names[index]==null){
				names[index]=name;
				break;
			}
		}
		System.out.println("Name "+name +" is Added \n");
	}
	
	
	public boolean delete (String name){
		
		boolean deleted=false;
		
		for(int index=0 ; index<names.length ; index++){
			if(names[index]== name){
				names[index]=null;
				deleted=true;
				break;
			}
		}
		if(deleted==true){
			System.out.println("Element is Deleted: "+name);
		}
		return true;
	}
	
	public boolean search(String name){
		
		boolean found=false;
		
		for(int index=0 ; index<names.length ; index++){
			if(names[index].equals(name)){
				found=true;
				break;
			}
		}
		if(found==true){
			System.out.println("Element Found: "+name);
		}
		return true;
	}
	
	public void list(){
		//System.out.println("\n");
		System.out.println("Updated list is: ");
		System.out.println(Arrays.toString(names));
		//System.out.println("\n");
		
	}
	
	public void AscendingOrder(){
		
		Arrays.sort(this.names);
		//System.out.println("\n");
	}


	public void DescendingOrder(){
		
		Arrays.sort(this.names,Collections.reverseOrder());
		//System.out.println("\n");
	}
	
}
	
	public class NameArray{
	
	public static void main(String args[]){
		
		Name n1=new Name(4);
		
		//n1.Name(4);
		
		n1.add("Karan");
		n1.add("Piyush");
		n1.add("Anuj");
		n1.add("Ashish");
		
		n1.list();
		
		n1.search("Piyush");
		
		System.out.println("The Sorted Array in AscendingOrder is: ");
		n1.AscendingOrder();
		n1.list();
		System.out.println("Sorted Array in DescendingOrder is: ");
		n1.DescendingOrder();
		n1.list();
		
		n1.delete("Ashish");
		n1.list();
		
		
		
		
		
		
	}
	
	
	
}
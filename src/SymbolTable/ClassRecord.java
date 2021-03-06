package SymbolTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ClassRecord extends Record {

	private HashMap<String, MethodRecord> methods = new HashMap<>();
	private HashMap<String, Record> fields = new HashMap<>();
	
	public ClassRecord(String id, String type) { super(id, type);
	}
	
	public void addMethod(String methodName,MethodRecord methodRecord){
		this.methods.put(methodName, methodRecord);
	}
	public boolean Check_Method(String Method_Name){
		return this.methods.get(Method_Name)!=null;
	}
	
	public Record getMethod(String methodName){
		return methods.get(methodName);
	}
	
	public void addField(String fieldName, Record fieldRecord){
		this.fields.put(fieldName, fieldRecord);
	}
	
	public Record getField(String fieldName){
		return fields.get(fieldName);
	}
	
	public void printMethods(){
		 Iterator it = methods.entrySet().iterator();
         while (it.hasNext()) {
             Map.Entry pair = (Map.Entry)it.next();
             MethodRecord method = (MethodRecord) pair.getValue();
             System.out.print("\t->  "+ method.getType()+" "+method.getId());
             method.printParameters();
         }
	}
	
	public void printFieldDeclarations(){
		Iterator it = fields.entrySet().iterator();		
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Record method = (Record) pair.getValue();
	        System.out.print("\t FIELD:  "+ method.getType()+" "+method.getId());
	    }
		
		
	}
	public boolean lookup_Record(String key){ return fields.get(key)!=null; }
}

package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MethodRecord extends Record {

	//private ArrayList<Record> parameters = new ArrayList<>();
	private HashMap<Integer, Record> parameters = new HashMap<>();
	private ArrayList<String> fields = new ArrayList<>();
	int paramNumber = 0;
	private int paramNumber_unassigned;
	
	public MethodRecord(String id, String type) {
		super(id, type);
		paramNumber_unassigned=0;
	}

	public void addParameter(Record parameter) {
		//this.parameters.add(parameter);
		this.parameters.put(paramNumber, parameter);
		if(!parameter.isassigned()) paramNumber_unassigned++;
	}

	// check if method contains parameter
	public boolean containParameter(int paramNumber,Record parameter) {		
		// hash map
		Record paramRec = parameters.get(paramNumber);
		if(parameter == null || paramRec == null)
			return false;
		return paramRec.getType().equals(parameter.getType());
	}

	public int numberOfParameters() {
		return parameters.size();
	}

	public void printParameters() {
		System.out.print("( ");
		Iterator it = parameters.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        //System.out.println(pair.getKey() + " = " + pair.getValue());
	        System.out.print(pair.getValue().toString());
	    }
		/*
		for (Record it : parameters) {
			System.out.print(it.getType() + " " + it.getId() + " ");
		}
		*/
		System.out.print(" )\n");
	}
}

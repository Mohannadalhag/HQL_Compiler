package SymbolTable;
import MapReduce.SelectStructure;

import java.util.List;
import java.util.regex.*;
public class Record {

    protected String id;
    protected String type;
    private String Value;
    private List<List<String>> Value_Select;
    private SelectStructure selectStructure;
    private boolean assigned;
    public Record (String id, String type){
        this.id = id;
        this.type = type;
        assigned=false;
    }

    public void setValue(String Value) {
        this.Value = Value;
        assigned=true;
    }

    public void setValue_Select(List<List<String>> value_Select) {
        Value_Select = value_Select;
    }

    public String getValue() {
        return this.Value;
    }

    public List<List<String>> getValue_Select() {
        return Value_Select;
    }

    public boolean isassigned() {
        return assigned;
    }

    public String Check_Type_Of_Value(){
        Pattern patt=Pattern.compile("[-+]?\\b\\d+\\b");
        Matcher mat=patt.matcher(Value);
        if(mat.matches())return "int";
        patt=Pattern.compile("[-+]?((\\b[0-9]+)?\\.)?[0-9]+\\b");
        mat=patt.matcher(Value);
        if(mat.matches())return "float";
        patt=Pattern.compile("(t|T)(r|R)(u|U)(e|E)|(f|F)(a|A)(l|L)(s|S)(e|E)");
        mat=patt.matcher(Value);
        if(mat.matches())return "Bollean";
        patt=Pattern.compile("(\\'((\\'\\')|(\\\\\\')|(?!\\').)*\\')|(\"((\"\"|\\\\\")|.)*?\")");
        mat=patt.matcher(Value);
        if(mat.matches())return "String";
        return "";
    }
    public String getId(){
        return this.id;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Record: "+id+" : "+type;
    }

    public boolean lookup_Record(String column) {
        return false;
    }

    public void setSelectStructure(SelectStructure selectStructure) {
        this.selectStructure = selectStructure;
    }

    public SelectStructure getSelectStructure() {
        return selectStructure;
    }
}
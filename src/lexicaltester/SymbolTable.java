/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicaltester;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author ShariQ
 */
public class SymbolTable {
    
    public String name;
    public String type;
    public String AccModifier;
    public String staticc;
    public String category;
    public String extend;
    public String implement;
    public boolean assigned;
    public int scope=0;
    public int cs;
    public String cc;
    //Stack<Integer> scopeStack=new Stack();
    
    ArrayList<SymbolTable> clas=new ArrayList();
    ArrayList<SymbolTable> func=new ArrayList();
    ArrayList<SymbolTable> attr=new ArrayList();
    
    SymbolTable CN;//=new SymbolTable("", "", "", "", "", "", "");
    SymbolTable FN;//=new SymbolTable("", "", "", "", "", false);
    SymbolTable AN;//=new SymbolTable("", "", false,0);
    
    //++++++++++++++For Class+++++++++++++
    
    public SymbolTable(){
        CN=new SymbolTable("", "", "", "", "", "", "");
        FN=new SymbolTable("", "", "", "", "", false);
        AN=new SymbolTable("", "", false,0);
    }

    public SymbolTable(String name, String type, String accModifier, String staticc, String category, String extend, String implement) {
        this.name=name;
        this.type=type;
        this.AccModifier=accModifier;
        this.staticc=staticc;
        this.category=category;
        this.extend=extend;
        this.implement=implement;
    }
    
    public SymbolTable(String name,String type,String accModifier,String staticc,String category,boolean assigned){
        this.name=name;
        this.type=type;
        this.AccModifier=accModifier;
        this.staticc=staticc;
        this.category=category;
        this.assigned=assigned;
        
    }
    
    public SymbolTable(String name,String type,boolean assigned,int scope){
        this.name=name;
        this.type=type;
        this.assigned=assigned;
        this.scope=scope;
    }
    
    
    public String lookUp(String name,int CS,String CC){
        for(int i=0 ; i<attr.size() ; i++){
            if(attr.get(i).name.equals(name) && attr.get(i).cs==cs){
                return attr.get(i).type;
            }else
                if(func.get(i).name.equals(name) && func.get(i).cc.equals(cc)){
                    return func.get(i).type;
                }
        }
        return null;
    }
    
    public String flookUp(String name,String CC,String plist){
        for(int i=0 ; i<func.size() ; i++){
            if(func.get(i).name.equals(name) && func.get(i).cc.equals(CC) &&  func.get(i).type.equals(plist)){
                return func.get(i).type;
            }
        }
        
        return null;
    }
    
    public boolean insertVar(String name,String type,boolean assigned,int scope){
        this.AN=new SymbolTable(name, type, assigned, scope);
        if(!attr.contains(AN)){
            attr.add(AN);
            return true;
        }
        return false;
    }
    
    public boolean insertFunc(String name,String type,String accModifier,String staticc,String category,boolean assigned){
        this.FN=new SymbolTable( name, type, accModifier, staticc, category, assigned);
        if(!func.contains(FN)){
            func.add(CN);
            return true;
        }
        return false;
        
    }
    
    public boolean insertClas(String name,String type,String accModifier,String staticc,String category,String extend,String implement){
        this.CN=new SymbolTable( name, type, accModifier, staticc, category, extend, implement);
        if(!clas.contains(CN)){
            clas.add(CN);
            return true;
        }
        return false;
    }
    
    public void createScope(){
        scope++;
       // scopeStack.push(scope);
    }
    
    public void deleteScope(){
        //scopeStack.pop();
    }
    
    public String compability(String operator, String typ){
        if(operator.equals("IncDec") && (typ.equals("INT_CONST") || typ.equals("FLOAT_CONST") || typ.equals("CHAR_CONST"))){
            return typ;
        }else
            if(operator.equals("!") && typ.equals("BOOL_CONST")){
                return typ;
            }
        return null;
    }
    
    public String compability(String operator, String type1,String type2){
        if(type1.equals(type2)){
            return type1;
        }
        switch(type1){
            
            case "INT_CONST":
                if(type2.equals("INT_CONST")){
                    return type1;
                }
                break;
                
            case "FLOAT_CONST":
                if(type2.equals("FLOAT_CONST") || type2.equals("INT_CONST")){
                    return type1;
                }
                break;
                
            case "BOOL_CONST":
                if(type2.equals("BOOL_CONST")){
                    return type1;
                }
                break;
            
            case "CHAR_CONST":
                if(type2.equals("CHAR_CONST")){
                    return type1;
                }
                break;
            
            case "STR_CONST":
                if(type2.equals("STR_CONST")){
                    return type1;
                }
                break;
        }
        return null;
    }
    
    void showData(){
        for (int i = 0; i < clas.size(); i++) {
            System.out.println(clas.get(i).name+" "+clas.get(i).type+" "+clas.get(i).staticc+" "+clas.get(i).category+" "+clas.get(i).extend+" "+clas.get(i).assigned);
        }
        
    }
}

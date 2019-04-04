/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicaltester;

import java.util.Stack;

/**
 *
 * @author ShariQ
 */
public class B{
   public String name;
    public String type;
    public String AccModifier;
    public String staticc;
    public String category;
    public String extend;
    public String implement;
    public boolean assigned;
    public int scope;
    //Stack<Integer> scopeStack=new Stack();
    
    public B(){
        this.name="";
        this.type="->void";
        this.AccModifier="private";
        this.staticc="false";
        this.category="General";
        this.extend="";
        this.implement="";
        this.assigned=false;
        this.scope=0;
                
    }
    
    public B(String name, String type, String accModifier, String staticc, String category, String extend, String implement){
        this.name=name;
        this.type=type;
        this.AccModifier=accModifier;
        this.staticc=staticc;
        this.category=category;
        this.extend=extend;
        this.implement=implement;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccModifier() {
        return AccModifier;
    }

    public void setAccModifier(String AccModifier) {
        this.AccModifier = AccModifier;
    }

    public String getStaticc() {
        return staticc;
    }

    public void setStaticc(String staticc) {
        this.staticc = staticc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getImplement() {
        return implement;
    }

    public void setImplement(String implement) {
        this.implement = implement;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }
    
    
    public void createScope(){
        scope++;
        //scopeStack.push(scope);
    }
    
    public void deleteScope(){
        //scopeStack.pop();
    }
   
}

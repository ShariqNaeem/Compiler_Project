/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicaltester;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ShariQ
 */
public class A {
    static int i=0;
    static Token[] tokens;
    SymbolTable sym;
    List<String> Expr = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!","super","this");
    List<String> F = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!","super","this");
    List<String> E2 = Arrays.asList("||",")","$",",","]");
    List<String> ROP_ST = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!","super","this");
    List<String> AND = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!","super","this");
    List<String> AND2 = Arrays.asList("||","&&","$");
    List<String> ROP2 = Arrays.asList("ROP","||","&&","$");
    List<String> PM_ST = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!","super","this");
    List<String> PM2 = Arrays.asList("PM","ROP","||","&&","$");
    List<String> MMD_ST = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!","super","this");
    List<String> MMD2 = Arrays.asList("MMD","PM","ROP","||","&&","$");
    List<String> CONST_IDinit = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec");
    List<String> CONST_II = Arrays.asList("(","[",".","IncDec","MMD","PM","ROP","||","&&","$");
    List<String> X = Arrays.asList("=","(","[",".","MMD","PM","ROP","||","&&","$","?");
    List<String> PARAMETER = Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!",")","super","this");
    List<String> P_LIST = Arrays.asList(",",")");
    List<String> CONST = Arrays.asList("INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST");
    
    List<String> DECLARE = Arrays.asList("$","DT","string");
    List<String> DTS = Arrays.asList("$","DT","string");
    List<String> LIST = Arrays.asList("?",",");
    List<String> INIT = Arrays.asList("=",",","?");
    List<String> INIT2=Arrays.asList("ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec","(","!");
    
    List<String> ASSIGN_ST = Arrays.asList("$","ID");
    List<String> ASSIGN1 = Arrays.asList("ID");
    List<String>  ID_LIST= Arrays.asList("[",".","=");
    List<String> ASSIGN2 = Arrays.asList("new","ID","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","IncDec");
    
    List<String> ARRAY_DEC = Arrays.asList("DT","string");
    List<String> ARRAY_INIT = Arrays.asList("=","?");
    List<String> ARRAY2 = Arrays.asList("new","{");
    List<String> ARRAY_HC = Arrays.asList("INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST","}");
    List<String> ARRAY_EX = Arrays.asList(",","}");
    
    
    List<String> if_else = Arrays.asList("if");
    List<String> Body = Arrays.asList("this","super","untill","if","for","do","break","continue","switch","return","string","IncDec","ID","DT","{","?");
    List<String> MST = Arrays.asList("this","super","untill","if","for","do","break","continue","switch","return","string","IncDec","ID","DT","}");
    List<String> Else = Arrays.asList("else","$");
    
    List<String> While = Arrays.asList("untill");
    List<String> SST2 = Arrays.asList("ID","IncDec","[",".","=","(");
    List<String> SST3 = Arrays.asList("=");
    List<String> SST4 = Arrays.asList("[","ID","=");
    List<String> SST5 = Arrays.asList("=","IncDec");
    
    List<String> obj = Arrays.asList("=","?");
    List<String> object = Arrays.asList("ID");
    List<String> SST = Arrays.asList("this","super","untill","if","for","do","break","continue","switch","return","string","IncDec","ID","DT");
    
    List<String> CLASS_BODY = Arrays.asList("AM","abstract","ID","static","final","DT","string","void","}");
    List<String> CONSTRUCTOR2=Arrays.asList("super","untill","if","for","do","break","continue","switch","return","string","IncDec","ID","DT","}","this");
    List<String> CONSTRUCTOR_BODY=Arrays.asList("untill","if","for","do","break","continue","switch","return","string","IncDec","ID","DT","}","this","super");
    List<String> SPEC_KW = Arrays.asList("abstract","final","class");
    List<String> STATIC_FINAL = Arrays.asList("static","final","DT","string","void");
    List<String> INHERIT = Arrays.asList("extends","{");
    List<String> ASSCAL = Arrays.asList("ID");
    List<String> ASSCAL2 = Arrays.asList("(","=");
    List<String> CLASS4B = Arrays.asList("(","{","=",",","?");
    List<String> CLASS3B = Arrays.asList("DT","string","void");
    List<String> CLASS2B = Arrays.asList("DT","string","void","static","final","ID","abstract");
    List<String> CLASS5B = Arrays.asList("ID","[");
    
    List<String> ACCESS_MODIFIER = Arrays.asList("AM","class","DT","string","void","static","final","ID","abstract");
    List<String> CLASS_DEC = Arrays.asList("AM","abstract","final","class","$");
    List<String> SUPER_ST=Arrays.asList("untill","if","for","do","break","continue","switch","return","string","IncDec","ID","DT","}","this","super");
    
    
    List<String> FUNC_DEC = Arrays.asList("AM","abstract","final","static","DT","string","void","ID","$");
    List<String> FD2 = Arrays.asList("abstract","final","static","DT","string","void","ID");
    List<String> FD3 = Arrays.asList("DT","string","void","ID");
    List<String> RETURN_ST = Arrays.asList("DT","string","void");
    List<String> FUNC_BODY = Arrays.asList("{");
    List<String> ARGUMENTS = Arrays.asList("DT","ID","string",")");
    List<String> ARG_LIST = Arrays.asList(",",")");
    List<String> AG3 = Arrays.asList("[","ID");
    List<String> ARGU = Arrays.asList("DT","ID","string");
    
    List<String> FOR_ST = Arrays.asList("for");
    List<String> F1 = Arrays.asList("DT","ID","string","?");
    List<String> F2 = Arrays.asList("ID","IncDec","(","!","?","INT_CONST","FLOAT_CONST","BOOL_CONST","STR_CONST","CHAR_CONST");
    List<String> F3 = Arrays.asList("ID","IncDec",")");
    List<String> F4 = Arrays.asList("IncDec","{",".","=");
    
    List<String> DO_UNTILL = Arrays.asList("do");
    
    List<String> switch_st = Arrays.asList("switch");
    List<String> s_body = Arrays.asList("case","default","}");
    List<String> ST = Arrays.asList("{","?","untill","if","for","do","break","continue","switch","return","string","IncDec","ID","DT");
    List<String> Default = Arrays.asList("default","}");
    List<String> Break = Arrays.asList("break","case","default","}");
    
    
    List<String> Start = Arrays.asList("abstract","class","final","static","DT","string","void","ID");
    List<String> NO = Arrays.asList("ID");
    List<String> N1 = Arrays.asList("DT","string","void","ID");
    List<String> N2 = Arrays.asList("ID","[");
    List<String> N5 = Arrays.asList("=","(");
    List<String> N6 = Arrays.asList("class");
    List<String> N8 = Arrays.asList("(","=","$","?",",");
    List<String> N9 = Arrays.asList("class","DT","string","void");
    

    public A(Token[] token){
        tokens=token;
    }
    
    
    boolean Expr(int CS,String CC,String T){
        if(Expr.contains(tokens[i].getClassPart())){
            if(AND(CS,CC,T))
                if(E2(CS,CC,T,T))
                    return true;
        }
        return false;
    }
    
    boolean AND(int CS,String CC,String T){
        if(AND.contains(tokens[i].getClassPart())){
            if(ROP_st(CS,CC,T))
                if(AND2(CS,CC,T,T))
                    return true;
        }
        return false;
    }
    
    boolean E2(int CS,String CC,String T,String T1){
        String temp=T;
        if(tokens[i].getClassPart().equals("||")){
            String op=tokens[i].getValuePart();
            i++;
            if(AND(CS,CC,T)){
                T1=sym.compability(op, T, temp);
                if(T1==null){
                    System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                    return false;
                }
                    
                if(E2(CS,CC,T1,T))
                    return true;
            }
        }
        if(E2.contains(tokens[i].getClassPart())){ 
            T1=T;
            return true;
        }
        return false;
    }
    
    boolean ROP_st(int CS,String CC,String T){
        if(ROP_ST.contains(tokens[i].getClassPart())){
            if(PM_st(CS,CC,T))
                if(ROP2(CS,CC,T,T))
                    return true;
        }
        return false;
    }
    
    boolean AND2(int CS,String CC,String T,String T1){
        String temp=T;
        if(tokens[i].getClassPart().equals("&&")){
            String op=tokens[i].getValuePart();
            i++;
            if(ROP_st(CS,CC,T)){
                T1=sym.compability(op, T, temp);
                if(T1==null){
                    System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                    return true;
                }
                
                if(AND2(CS,CC,T1,T))
                    return true;
            }
        }
        if(AND2.contains(tokens[i].getClassPart())){
            T1=T;
           return true;
        }
        return false;
    }
    
    boolean PM_st(int CS,String CC,String T){
        if(PM_ST.contains(tokens[i].getClassPart())){
            //i++;
            if(MMD_st(CS,CC,T))
                if(PM2(CS,CC,T,T))
                    return true;
        }
        return false;
    }
    
    boolean ROP2(int CS,String CC,String T,String T1){
        String temp=T; 
        if(tokens[i].getClassPart().equals("ROP")){
            String op=tokens[i].getValuePart();
            i++;
            if(PM_st(CS,CC,T)){
                T1=sym.compability(op, T, temp);
                if(T1==null){
                    System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                    return false;
                }
                if(ROP2(CS,CC,T1,T))
                    return true;
                }
        }
            if(ROP2.contains(tokens[i].getClassPart())){
                T1=T;
                return true;
            }
        return false;
    }
    
    boolean MMD_st(int CS,String CC,String T){
        if(MMD_ST.contains(tokens[i].getClassPart())){
            //i++;
            if(F(CS,CC,T))
                if(MMD2(CS,CC,T,T))
                    return true;
        }
        return false;
    }
    
    boolean PM2(int CS,String CC,String T,String T1){
        String temp=T1;
        if(tokens[i].getClassPart().equals("PM")){
            String op=tokens[i].getValuePart();
            i++;
            if(MMD_st(CS,CC,T)){
                T1=sym.compability(op, T, temp);
                if(T1==null){
                    System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                    return false;
                }
                if(PM2(CS,CC,T1,T))
                    return true;
            }
        }
            if(PM2.contains(tokens[i].getClassPart())){
                T1=T;
                return true;
            }
        return false;
    }
    
    boolean MMD2(int CS,String CC,String T,String T1){
        String temp=T;
        if(tokens[i].getClassPart().equals("MMD")){
            String op=tokens[i].getValuePart();
            i++;
            if(F(CS,CC,T)){
                T1=sym.compability(op, T, temp);
                if(T1==null){
                    System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                    return false;
                }
                if(MMD2(CS,CC,T1,T))
                    return true;
            }
        }
            if(MMD2.contains(tokens[i].getClassPart())){
                T1=T;
                return true;
            }
        return false;
    }
    
    boolean F(int CS,String CC,String T){
        String temp=T;
        if(tokens[i].getClassPart().equals("!")){
            String op=tokens[i].getValuePart();
            i++;
            if(F(CS,CC,T))
                T=sym.compability(op, T);
                if(T==null){
                    System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                    return false;
                }
                return true;
        }
        else
            if(tokens[i].getClassPart().equals("(")){
                i++;
                if(Expr(CS,CC,T)){
                    if(tokens[i].getClassPart().equals(")")){
                        i++;
                        return true;
                    }
                }
                if(tokens[i].getClassPart().equals(")")){
                        i++;
                        return true;
            }
            }
                if(F.contains(tokens[i].getClassPart())){
                    //i++;
                    if(const_IDinit(CS,CC,T))
                        return true;
                }
                
                
            if(tokens[i].getClassPart().equals("super")){
                temp=checkExtend(CC);
                if (temp.equals("")) {
                    System.out.println("Class is not extended");
                    return false;
                }else
                    CC = temp;

                i++;
                if(tokens[i].getClassPart().equals(".")){
                    i++;
                    if(tokens[i].getClassPart().equals("ID")){
                        i++;
                        String N= tokens[i].getValuePart();
                        if(X(CS,CC,T,N)){
                            return true;
                        }
                    }
                }
            }
            
            
            
            if(tokens[i].getClassPart().equals("this")){
                i++;
                if(tokens[i].getClassPart().equals(".")){
                    i++;
                    if(tokens[i].getClassPart().equals("ID")){
                        i++;
                        String N= tokens[i].getValuePart();
                        if(X(CS,CC,T,N)){
                            return true;
                        }
                    }
                }
            }
        return false;
    }
    
    boolean const_IDinit(int CS,String CC,String T){
        if(tokens[i].getClassPart().equals("ID")){
            String N= tokens[i].getValuePart();
            i++;
            
            if(const_II(CS,CC,T,N))
                return true;
        }
        else
            if(tokens[i].getClassPart().equals("IncDec")){
                String op=tokens[i].getValuePart();
                i++;
                if(tokens[i].getClassPart().equals("ID")){
                    String N= tokens[i].getValuePart();
                    i++;
                    if(X(CS,CC,T,N)){
                        T=sym.compability(op, T);
                        if(T==null){
                            System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                            return false;
                        }
                        return true;
                    }
                }    
            }
            
        if(CONST_IDinit.contains(tokens[i].getClassPart())){
                if(Const(CS,CC,T))
                    return true;
            }
        return false;
    }
    
    boolean Const(int CS,String CC,String T){
        if(CONST.contains(tokens[i].getClassPart())){
            
            if(tokens[i].getClassPart().equals("STR_CONST")){
                T="string";
            }else
                if(tokens[i].getClassPart().equals("INT_CONST")){
                    T="int";
                }else
                    if(tokens[i].getClassPart().equals("BOOL_CONST")){
                        T="boolean";
                    }else
                        if(tokens[i].getClassPart().equals("FLOAT_CONST")){
                           T="float";
                        }else
                            if(tokens[i].getClassPart().equals("CHAR_CONST")){
                                T="char";
                            }
                
            i++;
            return true;
        }
        return false;
    }
    
    boolean const_II(int CS,String CC,String T,String N){
        if(tokens[i].getClassPart().equals("IncDec")){
            String op=tokens[i].getValuePart();
            T=sym.compability(op, T);
            if(T==null){
                    System.out.println("Un-Compatible Types At Line# "+tokens[i].getLinenum());
                    return false;
            }
            i++;
            return true;
        }else
            if(CONST_II.contains(tokens[i].getClassPart())){
                if(X(CS,CC,T,N)){
                    return true;
                }
            }
        return false;
    }
    
    boolean X(int CS,String CC,String T,String N){
        if(X.contains(tokens[i].getClassPart()) || tokens[i].getClassPart().equals("AO")){
        
            if(tokens[i].getClassPart().equals("(")){
            i++;
            if(Parameter(CS,CC,T,N)){
                if(tokens[i].getClassPart().equals(")")){
                    i++;
                    if(X(CS,CC,T,N))
                        return true;
                }
            }
        }else
            if(tokens[i].getClassPart().equals("[")){
                i++;
                if(Expr(CS,CC,T)){
                    if(T!="int"){
                        System.out.println("INVALID INDEXING");
                    }
                    if(tokens[i].getClassPart().equals("]")){
                        i++;
                        //////////////////////////// ARRAY CONCATENATE \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                        T+="[]";
                        T=sym.lookUp(N, CS, CC);
                        if(X(CS,CC,T,N))
                            return true;
                    }
                }
                
            }else
                if(tokens[i].getClassPart().equals(".")){
                    i++;
                    T=sym.lookUp(N, CS, CC);
                    if(T==null){
                        System.out.println("UNDECLARE CLASS: "+tokens[i].getLinenum());
                        return false;
                    }else
                        if(T!="ID"){
                            System.out.println("DOt NOT ALLOWED"+tokens[i].getLinenum());
                        }else{
                             CC=T;
                        }
                    
                    if( tokens[i].getClassPart().equals("ID")){
                        N=tokens[i].getValuePart();
                        i++;
                        if(X(CS,CC,T,N))
                            return true;
                    }
                }
        T=sym.lookUp(N, CS, CC);
        if(T==null){
            System.out.println("UNDECLARED: ");
        }
        return true;
        }
        return false;
    }
    
    boolean Parameter(int CS,String CC,String T,String N){
        if(PARAMETER.contains(tokens[i].getClassPart())){
            //i++;
            if(Expr(CS,CC,T)){
                if(P_list(CS,CC,T))
                    return true;
            }
//            if(P_list(CS,CC,T)){
//                return true;
//            }
            
            return true;
        }
        
        return false;
    }
    
    boolean P_list(int CS,String CC,String T){
        if(P_LIST.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals(",")){
                String temp=T;
                i++;
                if(Expr(CS,CC,T)){
                    temp=temp+","+T;
                    T=temp;
                    if(P_list(CS,CC,T))
                        return true;
                }
            }
                return true;
            }
        return false;
    }
    

    private String checkExtend(String CC) {
        for (int j = 0; j < this.sym.clas.size(); j++) {
            if (!this.sym.clas.get(j).name.equals(CC)){
              return  this.sym.clas.get(j).extend;
            }
        }
        
        return "";
    }
    
    boolean assigned;
    boolean Declare(int CS,String CC,String T){
        if(DECLARE.contains(tokens[i].getClassPart())){
            String temp;
            if(DTS(CS,CC,T)){
                temp=T;
                if(tokens[i].getClassPart().equals("ID")){
                    String N=tokens[i].getValuePart();
                    i++;
                    if(init(CS,CC,T,N)){
                        if(assigned){
                            T=sym.compability("=", temp, T);
                            assigned=false;
                        }
                        if(list(CS,CC,T))
                            return true;
                    }else
                        if(list(CS,CC,T))
                            return true;
                }
            }
        }
        return false;
    }
    
    boolean init(int CS,String CC,String T,String N){
        if(INIT.contains(tokens[i].getValuePart())){
            if(tokens[i].getClassPart().equals("AO") && tokens[i].getValuePart().equals("=")){
                String op=tokens[i].getValuePart();
                i++;
                if(Expr(CS,CC,T)){
                    T=sym.lookUp(N, CS, CC);
                    assigned=true;
                    if(!sym.insertVar(N, T, assigned, CS)){
                        System.out.println("ReDeclaration Error at Line "+tokens[i].getLinenum());
                        return false;
                    }
                    assigned=false;
                    return true;
                }
                    
            }
            return true;
        }
        return false;
    }
    
    boolean DTS(int CS,String CC,String T){
        if(DTS.contains(tokens[i].getClassPart())){
            T=tokens[i].getValuePart();
            i++;
            return true;
        }
        return false;
    }
    
    boolean list(int CS,String CC,String T){
        if(tokens[i].getClassPart().equals("?")){
            i++;
            return true;
        }
        if(tokens[i].getClassPart().equals(",") && tokens[i+1].getClassPart().equals("ID")){
            
            String N=tokens[i+1].getValuePart();
            i+=2;
            if(init(CS,CC,T,N))
                if(list(CS,CC,T))
                    return true;
        }
        return false;
    }
    
    boolean init2(int CS,String CC,String T){
        if(INIT2.contains(tokens[i].getClassPart())){
            if(Expr(CS,CC,T))
                return true;
            
        }
        return false;
    }
    
    boolean Assign_st(int CS,String CC,String T){
        if(ASSIGN_ST.contains(tokens[i].getClassPart())){
            if(Assign1(CS,CC,T)){
                if(tokens[i].getValuePart().equals("=") && tokens[i].getClassPart().equals("AO")){
                    i++;
                    if(Assign2(CS,CC,T)){
                        if(tokens[i].getClassPart().equals("?")){
                            i++;
                            return true;
                        }
                    }
                    if(tokens[i].getClassPart().equals("?")){
                            i++;
                            return true;
                        }
                    
                }
            }
            if(tokens[i].getClassPart().equals("AO") && tokens[i].getValuePart().equals("=")){
                    i++;
                    if(Assign2(CS,CC,T)){
                        if(tokens[i].getClassPart().equals("?")){
                            i++;
                            return true;
                        }
                    }
                }
        }
        return false;
    }
    
    boolean ID_list(int CS,String CC,String T,String N){
        if(ID_LIST.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("[")){
                i++;
                if(Expr(CS,CC,T)){
                    if(tokens[i].getClassPart().equals("]")){
                        i++;
                        if(ID_list(CS,CC,T,N))
                            return true;
                    }
                }
                
            }else
                if(tokens[i].getClassPart().equals(".") && tokens[i+1].getClassPart().equals("ID")){
                    
                    String nn=tokens[i+1].getValuePart();
                    i+=2;
                    if(ID_list(CS,CC,T,nn))
                        return true;
                }
                    if(ID_LIST.contains(tokens[i].getClassPart()) || (tokens[i].getValuePart().equals("=") && tokens[i].getClassPart().equals("AO"))){
                        return true;
                }
                    return true;
        }
        return false;
    }
     
    boolean Assign1(int CS,String CC,String T){
        if(ASSIGN1.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("ID")){
                String N=tokens[i].getValuePart();
                i++;
                if(ID_list(CS,CC,T,N))
                    return true;
            }    
        }
        return false;
    }
    
    boolean Assign2(int CS,String CC,String T){
        if(ASSIGN2.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("new") && tokens[i+1].getClassPart().equals("ID") && tokens[i].getClassPart().equals("(")){
                String N=tokens[i].getValuePart();
                i+=3;
                if(Parameter(CS,CC,T,N)){
                    if(tokens[i].getClassPart().equals(")")){
                        i++;
                        return true;
                    }
                }
                if(tokens[i].getClassPart().equals(")")){
                    i++;
                    return true;
                }
            }else
                if(Expr(CS,CC,T)){
                    return true;
                }
        }
        return false;
    }
    

 }


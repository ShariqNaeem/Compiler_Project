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
public class Semantic {
} 
 /*   static int i=0;
    static Token[] tokens;
    
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
    

    public Semantic(Token[] token){
        tokens=token;
    }
    
    public void validate(){
        
        if(Start_CFG()){
            if(i==tokens.length-1){
                System.out.println("Valid SYNTAX "+ i);
            }else
                System.out.println("Invalid " + tokens[i].getLinenum()+" " + i);  
            
        }
        else
            System.out.println("INVALID " + tokens[i].getLinenum()+" " + i);  
    }
//    
//    boolean s(){                                                                              b    b   
//        if(tokens[i].getClassPart().equals("AM")){	
//            return true;
//        }
//    return false;
//    }
//    

    
        //******************** IF - ELSE ***********************
    
       boolean if_else(){
            if(if_else.contains(tokens[i].getValuePart())){  
                if(tokens[i].getClassPart().equals("if") && tokens[i+1].getClassPart().equals("(")){
                  i+=2;
                  if(Expr()){
                    if(tokens[i].getClassPart().equals(")")){
                        i++;
                    }
                    if(Body())
                          if(Else())
                              return true;
                  }else{
                        if(tokens[i].getClassPart().equals(")")){
                           i++;
                        }
                        if(tokens[i].getClassPart().equals("?")){
                                i++;
                                return true;
                            }
                             if(Body()){
                                if(Else())
                                    return true;
                             }
                             if(tokens[i].getClassPart().equals("?")){
                                i++;
                                return true;
                            }
                    }
             }
           }
             return false;
       }
    
            
       boolean Body(){
            if(Body.contains(tokens[i].getClassPart())){
                 if(SST())
                     return true;
                 if(tokens[i].getClassPart().equals("{")){
                    i++;
                     if(Constructor2()){
                        if(tokens[i].getClassPart().equals("}")){
                            i++;
                            return true;
                        }
                     }
                     if(tokens[i].getClassPart().equals("}")){
                            i++;
                            return true;
                        }
                 }
       
              if(tokens[i].getClassPart().equals("?")){
                     i++;
                    return true;
            }
              
            }
            
        return false;
       }
       
       
       boolean MST(){
            if(MST.contains(tokens[i].getClassPart())){
                 if(SST()){
                     if(Constructor2()){
                         return true;
                     }
                     //return true;
                 }
                
            }
//            if(MST.contains(tokens[i].getClassPart())){
//                     return true;
//            }
            return false;
       }
    
       boolean Else(){
           if(Else.contains(tokens[i].getClassPart())){
                if(tokens[i].getClassPart().equals("else")){
                    i++;
                    if(Body())
                        return true;
                }
            }
            
           if(Else.contains(tokens[i].getClassPart())){
                   return true;
            }
            return false;
       }
       
       boolean SST(){
             if(SST.contains(tokens[i].getClassPart())){
                  if(While())
                     return true;
                  if(if_else())
                      return true;
                  if(For_st())
                      return true;
                  if(do_while())
                       return true;
                  if(switch_st())
                       return true;
                  
                  if(tokens[i].getClassPart().equals("IncDec") && tokens[i+1].getClassPart().equals("ID")){
                     i+=2;
                     if(X()){
                         if(tokens[i].getClassPart().equals("?")){
                             i++;
                             return true;

                         }
                     }
                        return true;
                }
                  
                  if(tokens[i].getClassPart().equals("break")){
                     i++;
                   if(tokens[i].getClassPart().equals("?")){
                       i++;
                       return true;
                   }
             }
                  
                  if(tokens[i].getClassPart().equals("continue")){
                     i++;
                   if(tokens[i].getClassPart().equals("?")){
                     i++;
                     return true;
                   }
             }
                  
                  if(tokens[i].getClassPart().equals("return")){
                     i++;
                   if(Expr())
                        if(tokens[i].getClassPart().equals("?")){
                            i++;
                            return true;
                        }
                    if(tokens[i].getClassPart().equals("?")){
                            i++;
                            return true;
                    }
             }
                  
               if(tokens[i].getClassPart().equals("string")){
                     i++;
                   if(tokens[i].getClassPart().equals("ID"))
                       i++;
                   if(init())
                      if(list())
                         return true;
             }
               
               
                  if(tokens[i].getClassPart().equals("ID")){
                     i++;
                   if(SST2())
                       return true;
             }
                  
                  if(tokens[i].getClassPart().equals("DT")){
                     i++;
                   if(SST4())
                      return true;
             }
                  
                  
             }
             return false;
       }
       
       boolean While(){
           if(While.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("untill")){
                     i++;
                   if(tokens[i].getClassPart().equals("("))
                       i++;
                   if(Expr())
                       return true;
                   if(tokens[i].getClassPart().equals(")"))
                       i++;
                   if(Body())
                       return true;
             }
           }
           return false;
       }
       
       boolean SST2(){
           if(tokens[i].getClassPart().equals("ID")){
               i++;
           if(obj()){
                if(tokens[i].getClassPart().equals("?")){
                    i++;
                    return true;
                }
           }
           }
           
//           if(tokens[i].getClassPart().equals("IncDec")){
//                i++;
//               if(tokens[i].getClassPart().equals("?"))
//                   i++;
//           }
           if(X()){
               if(SST5()){
                   if(tokens[i].getClassPart().equals("?")){
                    i++;
                    return true;
                }
               }
           }
           
//
//           if(SST2.contains(tokens[i].getClassPart()) || tokens[i].getClassPart().equals("AO")){
//                  if(ID_list())
//                      if(SST3())
//                          return true;
//           }
//           
//           if(tokens[i].getClassPart().equals("(")){
//              i++;
//              if(Parameter())
//                if(tokens[i].getClassPart().equals(")")){
//                    i++;
//                    if(tokens[i].getClassPart().equals("?")){
//                        i++;
//                        return true;
//                    }
//              }
//          }
           
           return false;
       }
       
       boolean SST5(){
           if(SST5.contains(tokens[i].getClassPart()) || tokens[i].getClassPart().equals("AO")){
               if (SST3())
                   return true;
               
              if(tokens[i].getClassPart().equals("IncDec")){
                i++;
                return true;
              } 
           }
           return false;
       }
       
       boolean SST3(){
          if(tokens[i].getClassPart().equals("AO") && tokens[i].getValuePart().equals("=")){
              i++;
                if(Expr()){
                    if(tokens[i].getClassPart().equals("?")){
                        i++;
                        return true;
                    }
                }
                        return true;
          }
          
//          if(tokens[i].getClassPart().equals("(")){
//              i++;
//              if(Parameter())
//                if(tokens[i].getClassPart().equals(")")){
//                    i++;
//                    if(tokens[i].getClassPart().equals("?")){
//                        i++;
//                        return true;
//                    }
//              }
//          }
          return false;
       }
       
       boolean SST4(){
        if(SST4.contains(tokens[i].getClassPart())){   
           if(tokens[i].getClassPart().equals("[") && tokens[i+1].getClassPart().equals("]") && tokens[i+2].getClassPart().equals("ID")){
                i+=3;
               if(array_init()){
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
           
            if(tokens[i].getClassPart().equals("ID")){
                i++;
                    if(init())
                      if(list())
                          return true;
            }
        }
               return false;
       }
       
//       boolean init(){
//            if(tokens[i].getClassPart().equals("=")){
//                i++;
//                if(init2())
//                    return true;
//            }
//            return false;
//       }
//       
//       boolean list(){
//           if(tokens[i].getClassPart().equals("?")){
//               i++;
//           }
//           if(tokens[i].getClassPart().equals(",")){
//               i++;
//           if(tokens[i].getClassPart().equals("ID"))
//               i++;
//           if(init())
//               return true;
//           if(list())
//               return true;
//           }
//           return false;
//       }
       
       boolean obj(){
           if(obj.contains(tokens[i].getClassPart()) || tokens[i].getClassPart().equals("AO")){
               if(tokens[i].getValuePart().equals("=") && tokens[i+1].getClassPart().equals("new") && tokens[i+2].getClassPart().equals("ID") && tokens[i+3].getClassPart().equals("(")){
                   i+=4;
                   if(Parameter()){
                       if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("?")){
                           i+=2;
                       return true;
                       }
                   }
                       if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("?")){
                           i+=2;
                            return true;
                       }
                   
               }
               return true;
           }
           return false;
       }
       
       boolean object(){
          if(object.contains(tokens[i].getClassPart())){
              if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("ID")){
                  i+=2;
                  if(obj()){
                      if(tokens[i].getClassPart().equals("?")){
                           i++;
                       return true;
                       }
                  }
              }
          }
          return false;
       }
       
//       boolean init2(){
//          //selection set nhi pata
//          return true;
//       }
//       
//       boolean array_init(){
//           //selection set nhi pata
//           return true;
//       }
//       
//       boolean Assign2(){
//           return true;
//       }
//       
//       boolean ID_list(){
//           return true;
//       }
       
    
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
            //i++;
            if(ROP_st(CS,CC,T))
                if(AND2(CS,CC,T,T))
                    return true;
        }
        return false;
    }
    
    boolean E2(int CS,String CC,String T,String T1){
        if(tokens[i].getClassPart().equals("||")){
            i++;
            if(AND(CS,CC,T))
                if(E2(CS,CC,T,T))
                    return true;
        }
        if(E2.contains(tokens[i].getClassPart())) 
            return true;
        
        return false;
    }
    
    boolean ROP_st(int CS,String CC,String T){
        if(ROP_ST.contains(tokens[i].getClassPart())){
            //i++;
            if(PM_st(CS,CC,T))
                if(ROP2(CS,CC,T,T))
                    return true;
        }
        return false;
    }
    
    boolean AND2(int CS,String CC,String T,String T1){
        if(tokens[i].getClassPart().equals("&&")){
            i++;
            if(ROP_st(CS,CC,T))
                if(AND2(CS,CC,T,T))
                    return true;
        }
            if(AND2.contains(tokens[i].getClassPart()))
                return true;
        
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
         if(tokens[i].getClassPart().equals("ROP")){
            i++;
            if(PM_st(CS,CC,T))
                if(ROP2(CS,CC,T,T))
                    return true;
        }
            if(ROP2.contains(tokens[i].getClassPart()))
                return true;
        
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
        if(tokens[i].getClassPart().equals("PM")){
            i++;
            if(MMD_st(CS,CC,T))
                if(PM2(CS,CC,T,T))
                    return true;
        }
            if(PM2.contains(tokens[i].getClassPart()))
                return true;
        
        return false;
    }
    
    boolean MMD2(int CS,String CC,String T,String T1){
        if(tokens[i].getClassPart().equals("MMD")){
            i++;
            if(F(CS,CC,T))
                if(MMD2(CS,CC,T,T))
                    return true;
        }
            if(MMD2.contains(tokens[i].getClassPart()))
                return true;
        
        return false;
    }
    
    boolean F(int CS,String CC,String T){
        if(tokens[i].getClassPart().equals("!")){
            i++;
            if(F(CS,CC,T))
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
                i++;
                if(tokens[i].getClassPart().equals(".")){
                    i++;
                    if(tokens[i].getClassPart().equals("ID")){
                        i++;
                        String N= tokens[i].getClassPart();
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
                        String N= tokens[i].getClassPart();
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
            String N= tokens[i].getClassPart();
            i++;
            
            if(const_II(CS,CC,T,N))
                return true;
        }
        else
            if(tokens[i].getClassPart().equals("IncDec")){
                i++;
                if(tokens[i].getClassPart().equals("ID")){
                    String N= tokens[i].getClassPart();
                    i++;
                    if(X(CS,CC,T,N))
                        return true;
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
            i++;
            return true;
        }
        return false;
    }
    
    boolean const_II(int CS,String CC,String T,String N){
        if(tokens[i].getClassPart().equals("IncDec")){
            i++;
            return true;
        }else
            if(CONST_II.contains(tokens[i].getClassPart())){
                if(X(CS,CC,T,N))
                    return true;
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
                    if(tokens[i].getClassPart().equals("]")){
                        i++;
                        if(X(CS,CC,T,N))
                            return true;
                    }
                }
                
            }else
                if(tokens[i].getClassPart().equals(".") && tokens[i+1].getClassPart().equals("ID")){
                    i+=2;
                    if(X(CS,CC,T,N))
                        return true;
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
            if(P_list(CS,CC,T)){
                return true;
            }
            
            return true;
        }
        
        return false;
    }
    
//    boolean index(){
//        if(Expr.contains(tokens[i].getClassPart())){
//            if(Expr())
//                return true;
//            
//            return true;
//        }
//        return false;
//    }
    
    boolean P_list(int CS,String CC,String T){
        if(P_LIST.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals(",")){
                i++;
                if(Expr(CS,CC,T))
                    if(P_list(CS,CC,T))
                        return true;
            }
        
        
                return true;
            }
        return false;
    }
    
    
    boolean Declare(){
        if(DECLARE.contains(tokens[i].getClassPart())){
            if(DTS()){
                if(tokens[i].getClassPart().equals("ID")){
                    i++;
                    if(init()){
                        if(list())
                            return true;
                    }else
                        if(list())
                            return true;
                }
            }
        }
        return false;
    }
    
    boolean DTS(){
        if(DTS.contains(tokens[i].getClassPart())){
            i++;
            return true;
        }
        return false;
    }
    
    boolean list(){
        if(tokens[i].getClassPart().equals("?")){
            i++;
            return true;
        }
        if(tokens[i].getClassPart().equals(",") && tokens[i+1].getClassPart().equals("ID")){
            i+=2;
            if(init())
                if(list())
                    return true;
        }
        return false;
    }
    
    boolean init(){
//        if(INIT.contains(tokens[i].getClassPart())){
//            if(tokens[i].getClassPart().equals("AO")){
//                if(tokens[i].getValuePart().equals("=")){
//                    i++;
//                    if(Expr()){
//                        if(init())
//                            return true;
//                    }
//                    if(init())
//                        return true;
//                }
//            }
//        }
//        
//        if(INIT.contains(tokens[i].getValuePart())){
//            if(tokens[i].getClassPart().equals("AO")){
//                if(tokens[i].getValuePart().equals("=")){
//                    i++;
//                    if(init())
//                        return true;
//                }
//            }
//        }
//        
        if(INIT.contains(tokens[i].getValuePart())){
            if(tokens[i].getClassPart().equals("AO") && tokens[i].getValuePart().equals("=")){
                i++;
                if(Expr(CS,CC,T))
                    return true;
            }
            return true;
        }
        return false;
    }
    
    boolean init2(){
        if(INIT2.contains(tokens[i].getClassPart())){
            if(Expr(CS,CC,T))
                return true;
            
        }
        return false;
    }
    
    
    boolean Assign_st(){
        if(ASSIGN_ST.contains(tokens[i].getClassPart())){
            if(Assign1()){
                if(tokens[i].getValuePart().equals("=") && tokens[i].getClassPart().equals("AO")){
                    i++;
                    if(Assign2()){
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
                    if(Assign2()){
                        if(tokens[i].getClassPart().equals("?")){
                            i++;
                            return true;
                        }
                    }
                }
        }
        return false;
    }
    
    boolean ID_list(){
        if(ID_LIST.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("[")){
                i++;
                if(index()){
                    if(tokens[i].getClassPart().equals("]")){
                        i++;
                        if(ID_list())
                            return true;
                    }
                }
                
            }else
                if(tokens[i].getClassPart().equals(".") && tokens[i+1].getClassPart().equals("ID")){
                    i+=2;
                    if(ID_list())
                        return true;
                }
                    if(ID_LIST.contains(tokens[i].getClassPart()) || (tokens[i].getValuePart().equals("=") && tokens[i].getClassPart().equals("AO"))){
                        return true;
                }
                    return true;
        }
        return false;
    }
     
    boolean Assign1(){
        if(ASSIGN1.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("ID")){
                i++;
                if(ID_list())
                    return true;
            }    
        }
        return false;
    }
    
    boolean Assign2(){
        if(ASSIGN2.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("new") && tokens[i+1].getClassPart().equals("ID") && tokens[i].getClassPart().equals("(")){
                i+=3;
                if(Parameter()){
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
    
    boolean Arr_Dec(){
        if(ARRAY_DEC.contains(tokens[i].getClassPart())){
            if(DTS()){
                if(tokens[i].getClassPart().equals("[") && tokens[i+1].getClassPart().equals("]") && tokens[i+2].getClassPart().equals("ID")){
                    i+=3;
                    if(array_init()){
                        if(tokens[i].getClassPart().equals("?"))
                            i++;
                            return true;
                    }else
                        if(tokens[i].getClassPart().equals("?")){
                            i++;
                            return true;
                        }
                }
            }
        }
        return false;
    }
    
    boolean array_init(){
            if(tokens[i].getValuePart().equals("=")){
                i++;
                if(array2())
                    return true;
            }
        
        else
            if(ARRAY_INIT.contains(tokens[i].getClassPart()))
                return true;
        
        return false;
    }
    
    boolean array2(){
        if(ARRAY2.contains(tokens[i].getClassPart()) ){
            if(tokens[i].getClassPart().equals("new")){
                i++;
                if(DTS()){
                    if(tokens[i].getClassPart().equals("[")){
                        i++;
                        if(index()){
                            if(tokens[i].getClassPart().equals("]")){
                                i++;
                                return true;
                            }
                        }
                        if(tokens[i].getClassPart().equals("]")){
                            i++;    
                            return true;
                        }
                    }
                }
            }
            if(tokens[i].getClassPart().equals("{")){
                i++;
                if(array_hc()){
                    if(tokens[i].getClassPart().equals("}")){
                        i++;
                        return true;
                    }
                }
                if(tokens[i].getClassPart().equals("}")){
                    i++;
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean array_hc(){
        if(ARRAY_HC.contains(tokens[i].getClassPart())){
            if(Const()){
                if(array_ex())
                    return true;
            }    
        }
        if(ARRAY_HC.contains(tokens[i].getClassPart())){
         return true;   
        }
        return false;
    }
    
    boolean array_ex(){
        if(ARRAY_EX.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals(",")){
                i++;
                if(Const())
                    if(array_ex())
                        return true;
            }
        }
        if(ARRAY_EX.contains(tokens[i].getClassPart())){
            return true;
        }
        return false;
    }
    //************ CLASS DECLARATION ******************************\\
    boolean Class_Dec(){
        if(CLASS_DEC.contains(tokens[i].getClassPart())){
            if(Access_Modifier()){
                if(spec_kw()){
                    if(tokens[i].getClassPart().equals("class") && tokens[i+1].getClassPart().equals("ID")){
                        i+=2;
                        if(inherit()){
                            if(tokens[i].getClassPart().equals("{")){
                                i++;
                                if(Class_Body()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }else{
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                            }    
                        }
                    }
                }
                    
            }
        }
        return false;
    }
    
    boolean spec_kw(){
        if(SPEC_KW.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("abstract") || tokens[i].getClassPart().equals("final")){
                i++;
                return true;
            }
            return true;
        }
        return false;
    }
    
    boolean inherit(){
        if(INHERIT.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("extends") && tokens[i+1].getClassPart().equals("ID")){
                i+=2;
                return true;
            }
            return true;
        }
        return false;
    }
    
    boolean static_final(){
        if(STATIC_FINAL.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("static") || tokens[i].getClassPart().equals("final")){
                i++;
                return true;
            }
            return true;
        }
        return false;
    }
    
    boolean Class_Body(){
        if(CLASS_BODY.contains(tokens[i].getClassPart())){
            if(Access_Modifier()){
                if(Class2b()){
                    if(Class_Body())
                        return true;
                }
            }
            return true;
        }
        return false;
    }
    
    boolean Class2b(){
        //************************** STATIC/FINAL (ATTRIBUTE,METHODS)*********************************
        if(CLASS2B.contains(tokens[i].getClassPart())){
            if(static_final()){
                if(Class3b())
                    return true;
            }
            //*************** ABSTRACT METHODS ****************************************
            if(tokens[i].getClassPart().equals("abstract")){
                i++;
                if(return_st()){
                    if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("(")){
                        i+=2;
                        if(Arguments()){
                            if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor2()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
                        }
                        
                        if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor2()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
                    }
                }
            }
            
        //*************** CONSTRUCTOR ******************************************************    
            if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("(")){
                        i+=2;
                        if(Arguments()){
                            if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor_Body()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
                        }
                        
                        if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor_Body()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
                    }
        }
        return false;
    }
    boolean Class5b(){
        if(CLASS5B.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("ID")){
                i++;
                if(Class4b())
                    return true;
            }
            
            if(tokens[i].getClassPart().equals("[") && tokens[i+1].getClassPart().equals("]") && tokens[i+2].getClassPart().equals("ID")){
                i+=3;
                if(array_init()){
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
        return false;
    }
    
    boolean Class3b(){
        if(CLASS3B.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("DT")){
                i++;
                if(Class5b())
                    return true;
            }
            
            if(tokens[i].getClassPart().equals("string")){
                i++;
                if(Class5b())
                    return true;
            }
            
            if(tokens[i].getClassPart().equals("void")  && tokens[i+1].getClassPart().equals("ID") && tokens[i+2].getClassPart().equals("(")){
                i+=3;
                if(Arguments()){
                            if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor2()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
                        }
                        
                        if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor_Body()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
            }
            
            if(tokens[i].getClassPart().equals("ID")  && tokens[i+1].getClassPart().equals("ID") && tokens[i+2].getClassPart().equals("(")){
                i+=3;
                if(Arguments()){
                            if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor2()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
                        }
                        
                        if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                                i+=2;
                                if(Constructor_Body()){
                                    if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                                }
                                if(tokens[i].getClassPart().equals("}")){
                                        i++;
                                        return true;
                                    }
                            }
            }
            return true;
        }
        return false;
    }
    
    boolean Class4b(){
        if(tokens[i].getClassPart().equals("AO") && tokens[i].getValuePart().equals("=")){
                i++;
                if(Expr(CS,CC,T)){
                    if(tokens[i].getClassPart().equals("?")){
                        i++;
                        return true;
                    }
                }
                if(tokens[i].getClassPart().equals("?"))
                        return true;
            }
        
        if(CLASS4B.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("(")){
                i++;
                if(Arguments()){
                    if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("{")){
                        i+=2;
                        if(Constructor2())
                            if(tokens[i].getClassPart().equals("}")){
                                i++;
                                return true;
                            }
                    }
                }
            }
            
            if(init());
                if(list()){
                    return true;
                }
                
            
            
            if(tokens[i].getClassPart().equals("{")){
                i++;
                if(Constructor2()){
                    if(tokens[i].getClassPart().equals("}")){
                        i++;
                        return true;
                    }
                }
                if(tokens[i].getClassPart().equals("}")){
                    i++;
                    return true;
                }
            }            
        }
        return false;
    }
    
    boolean Constructor_Body(){
        if(CONSTRUCTOR_BODY.contains(tokens[i].getClassPart())){
            if(super_st()){
                if(Constructor2())
                    return true;
            }
            return true;
        }
        return false;
    }
    
    boolean Constructor2(){
        if(CONSTRUCTOR2.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("super") && tokens[i+1].getClassPart().equals(".")){
                i+=2;
                if(AssCal()){
                    if(Constructor2())
                        return true;
                }
            }
            
            
            
            if(tokens[i].getClassPart().equals("this") && tokens[i+1].getClassPart().equals(".")){
                i+=2;
                if(AssCal()){
                    if(Constructor2())
                        return true;
                }
            }
            
            if(MST()){
                if(Constructor2())
                    return true;
            }
            
            return true;
        }
        return false;
    }
    
    boolean super_st(){
        if(SUPER_ST.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("super") && tokens[i+1].getClassPart().equals("(")){
                i+=2;
                if(Parameter()){
                    if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("?")){
                        i+=2;
                        return true;
                    }
                }
                if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("?")){
                        i+=2;
                        return true;
                    }
            }
            return true;
        }
        return false;
    }
    
    boolean Access_Modifier(){
        if(ACCESS_MODIFIER.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("AM")){
                i++;
                return true;
            }
            return true;
        }
        return false;
    }
    
    

    boolean AssCal(){
        if(ASSCAL.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("ID")){
                i++;
                if(X())
                    if(AssCal2())
                        return true;
            }
        }
        return false;
    }

    boolean AssCal2() {
     //   if(ASSCAL2.contains(tokens[i].getClassPart()) || tokens[i].getClassPart().equals("AO")){
//            if(tokens[i].getClassPart().equals("(")){
//                i++;
//                if(Parameter()){
//                    if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("?")){
//                        i+=2;
//                        return true;
//                    }
//                }
//                if(tokens[i].getClassPart().equals(")") && tokens[i+1].getClassPart().equals("?")){
//                    i+=2;
//                    return true;
//                }
//            }
//            
            
            if(tokens[i].getClassPart().equals("AO") && tokens[i].getValuePart().equals("=")){
                i++;
                if(Expr(CS,CC,T)){
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
        //}
        return false;
    }
    
    boolean Func_Dec(){
        if(FUNC_DEC.contains(tokens[i].getClassPart())){
            if(Access_Modifier()){
                if(fD2())
                    return true;
            }
        }
        return false;
    }
    
    boolean fD2(){
        if(FD2.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("abstract")){
                if(fD3())
                    if(tokens[i].getClassPart().equals("?")){
                        i++;
                        return true;
                    }
            }
            
            if(static_final()){
                if(fD3())
                    if(func_body())
                        return true;
            }
        }
        return false;
    }
    
    boolean fD3(){
        if(FD3.contains(tokens[i].getClassPart())){
            if(return_st())
                if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("(")){
                    i+=2;
                    if(Arguments())
                        if(tokens[i].getClassPart().equals(")")){
                            i++;
                            return true;
                        }
                }
        }
        return false;
    }
    
    boolean func_body(){
        if(FUNC_BODY.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("{")){
                i++;
                if(Constructor2())
                    if(tokens[i].getClassPart().equals("}")){
                        i++;
                        return true;
                    }
                if(tokens[i].getClassPart().equals("}")){
                        i++;
                        return true;
                    }
            }
        }
        return false;
    }
    
    boolean Argu(){
        if(ARGU.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("ID") &&  tokens[i+1].getClassPart().equals("ID")){
                i+=2;
                if(Arg_list())
                    return true;
            }
            
            if(DTS()){
                if(Ag3())
                    return true;
            }
        }
        return false;
    }
    
    boolean Arg_list(){
        if(ARG_LIST.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals(",")){
                i++;
                if(Argu())
                    return true;
            }
            return true;
        }
        return false;
    }
    
    boolean Ag3(){
        if(AG3.contains(tokens[i].getClassPart())){
            if(tokens[i].getClassPart().equals("[") &&  tokens[i+1].getClassPart().equals("]") && tokens[i+2].getClassPart().equals("ID")){
                i+=3;
                if(Arg_list())
                    return true;
            }
            
            if(tokens[i].getClassPart().equals("ID")){
                i++;
                if(Arg_list())
                    return true;
            }
        }
        return false;
    }
    
    boolean return_st(){
        if(RETURN_ST.contains(tokens[i].getClassPart())){
            i++;
            return true;
        }
        return false;
    }
    
    boolean Arguments(){
        if(ARGUMENTS.contains(tokens[i].getClassPart())){
            if(Argu())
                return true;
            
            return true;
        }
        return false;
    }
       
       
          boolean do_while(){
               if(DO_UNTILL.contains(tokens[i].getClassPart())){
                 if(tokens[i].getClassPart().equals("do")){
                        i++;
                    if(tokens[i].getClassPart().equals("{")){
                        i++;
                       if(MST());
                           if(tokens[i].getClassPart().equals("}")){
                                i++;
                               if(tokens[i].getClassPart().equals("untill")){
                                   i++;
                                 if(tokens[i].getClassPart().equals("(")){
                                     i++;
                                     if(Expr(CS,CC,T)){
                                         if(tokens[i].getClassPart().equals(")")){
                                                i++;
                                               if(tokens[i].getClassPart().equals("?")){
                                                    i++;
                                                    return true;
                                               }
                                         }    
                                         
                                     }
                                     if(tokens[i].getClassPart().equals(")")){
                                                i++;
                                               if(tokens[i].getClassPart().equals("?")){
                                                    i++;
                                                    return true;
                                               }
                                         }
                                     
                                    }
                               }
                           }
                       
                    }
                 }
            }
            return false;
       }
       
       
        boolean For_st(){
            if(FOR_ST.contains(tokens[i].getClassPart())){
               if(tokens[i].getClassPart().equals("for") && tokens[i+1].getClassPart().equals("(")){
                   i+=2;
                   if(F1())
                       if(F2()){
                           if(tokens[i].getClassPart().equals("?")){
                               i++;
                               if(F3()){
                                   if(tokens[i].getClassPart().equals(")")){
                                       i++;
                                       if(Body())
                                           return true;
                                   }
                               }
                           }
                       }
                   
                }
           }
           return false;
       }
       
       
        boolean F1(){
    
            if(F1.contains(tokens[i].getClassPart())){
               if(Declare())
                   return true;
               
               if(tokens[i].getClassPart().equals("?")){
                   i++;
                   return true;
               }
               
               if(Assign_st()){
                   return true;
               }
           }
           return false;
       }
        
        
       boolean F2(){
            if(F2.contains(tokens[i].getClassPart())){
                
                 if(Expr(CS,CC,T))
                     return true;
                 
                 return true;
            }
            return false;
       }
       
    boolean F3(){
           if(F3.contains(tokens[i].getClassPart())){
               
               if(tokens[i].getClassPart().equals("ID")){
                     i++;
                     if(F4())
                        return true;
               }
                  
               if(tokens[i].getClassPart().equals("Incdec")){
                    i++;
                    if(tokens[i].getClassPart().equals("ID")){
                        i++;
                        return true;
                    }
               }
                
                  
                return true;
           }
           return false;
}
    
    boolean F4(){
           if(F4.contains(tokens[i].getClassPart())){
               if(tokens[i].getClassPart().equals("IncDec")){
                   i++;
                   return true;
               }
               
               if(ID_list()){
                  if(tokens[i].getClassPart().equals("=")){
                       i++;
                       if(Expr(CS,CC,T))
                           return true;
                       
                       return true;
                  }
               }
           }
           return false;
    }
    
    boolean switch_st(){
           if(switch_st.contains((tokens[i].getClassPart())))
             if(tokens[i].getClassPart().equals("switch")){
                         i++;
                 if(tokens[i].getClassPart().equals("(")){
                     i++;
                     if(Expr(CS,CC,T));
                        if(tokens[i].getClassPart().equals(")")){
                             i++;
                             if(tokens[i].getClassPart().equals("{")){
                                 i++;
                                if(S_Body());
                                    if(Default())
                                        if(tokens[i].getClassPart().equals("}")){
                                                i++;
                                                return true;
                                        }
                             }
                        }
                 }
           
        }
           return false;
       
       }
    
    boolean S_Body(){
           if(s_body.contains(tokens[i].getClassPart())){
              if(tokens[i].getClassPart().equals("case")){
                   i++;
                  if(Const())
                      if(tokens[i].getClassPart().equals(":")){
                          i++;
                         if(ST())
                             if(Break())
                               if(S_Body())
                                   return true;
                      }
              }
           }
           else if(s_body.contains(tokens[i].getClassPart()))
                      return true;
               
           return false;
       }
       
       boolean Break(){
          if(Break.contains(tokens[i].getClassPart())){
                 if(tokens[i].getClassPart().equals("break")){
                        i++;
                        return true;
                 }
          }
          
          if(Break.contains(tokens[i].getClassPart()))
             return true;
          
          return false;
       }
       
       boolean ST(){
           if(ST.contains(tokens[i].getClassPart())){
               
                if(MST())
                    return true;
                
                if(tokens[i].getClassPart().equals("{")){
                    i++;
                    if(MST())
                        if(tokens[i].getClassPart().equals("}")){
                             i++;
                             return true;
                        }
                }
                
                if(tokens[i].getClassPart().equals("?")){
                      i++;
                      return true;
                }
           }
           return false;
       }
       
       boolean Default(){
             if(Default.contains(tokens[i].getClassPart())){
                 if(tokens[i].getValuePart().equals("default")){
                     i++;
                     if(tokens[i].getValuePart().equals(":")){
                         i++;
                   if(ST())
                       return true;      
                     }
                 }
             }
             if(Default.contains(tokens[i].getClassPart()))
                 return true;
             
             
             return false;
       }
       
       
       boolean Start(){
           if(Start.contains(tokens[i].getClassPart())){
               if(tokens[i].getClassPart().equals("abstract")){
                 i++;
                   if(N6())
                     return true;
               }
               
               if(tokens[i].getClassPart().equals("final")){
                 i++;
                   if(N9())
                     return true;
               }
               
               if(tokens[i].getClassPart().equals("static")){
                 i++;
                   if(N1())
                     return true;
               }
               
               if(tokens[i].getClassPart().equals("void")){
                 i++;
                   if(NO())
                     return true;
               }
               
               if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("ID")){
                   i+=2;
                    if(N5()){
                            return true;
                    }
                    if(tokens[i].getClassPart().equals("?")){
                        i++;
                        return true;
                    }
               }
               
               if(DTS.contains(tokens[i].getClassPart())){
                   if(DTS())
                       if(N2())
                           return true;
               }
               
               if(N6())
                   return true;
               
           }
           return false;
       }
       
       boolean N6(){
           if(tokens[i].getClassPart().equals("class") && tokens[i+1].getClassPart().equals("ID")){
               i+=2;
               if(inherit())
                   if(tokens[i].getClassPart().equals("{")){
                       i++;
                       if(Class_Body()){
                           if(tokens[i].getClassPart().equals("}")){
                               i++;
                               return true;
                           }
                       }
                       if(tokens[i].getClassPart().equals("}")){
                               i++;
                               return true;
                           }
                   }
           }
           return false;
       }
       
       boolean NO(){
           if(NO.contains(tokens[i].getClassPart())){
               if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("(")){
                   i+=2;
                   if(Arguments())
                       if(tokens[i].getClassPart().equals(")")){
                           i++;
                           if(func_body())
                               return true;
                       }
                   
               }
           }
           return false;
       }
       
       boolean N1(){
           if(N1.contains(tokens[i].getClassPart())){
               if(DTS()){
                   if(N2())
                       return true;
               }
               
               if(tokens[i].getClassPart().equals("void")){
                    if(NO())
                        return true;
               }
               
               
               if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("ID")){
                   i+=2;
                    if(N5()){
                            return true;
                    }
               }
           }
           return false;
       }
       
       boolean N9(){
           if(N9.contains(tokens[i].getClassPart())){
               if(N1())
                   return true;
               
               if(N6())
                   return true;
           }
           return false;
       }
       
       boolean N2(){
           if(N2.contains(tokens[i].getClassPart())){
           if(tokens[i].getClassPart().equals("[") && tokens[i+1].getClassPart().equals("]") && tokens[i+2].getClassPart().equals("ID")){
               i+=3;
               
               if(array_init()){
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
           if(tokens[i].getClassPart().equals("ID")){
               i++;
               if(N8())
                   return true;
           }
           }
           return false;
       }
       
    boolean N8(){
        if(N8.contains(tokens[i].getClassPart()) || (tokens[i].getValuePart().equals("="))){
           if(tokens[i].getClassPart().equals("ID") && tokens[i+1].getClassPart().equals("(")){
                   i+=2;
                   if(Arguments())
                       if(tokens[i].getClassPart().equals(")")){
                           if(func_body())
                               return true;
                       }
                   if(tokens[i].getClassPart().equals(")")){
                           if(func_body())
                               return true;
                       }
             }
           
           if(init()){
               if(list())
                   return true;
           }
           if(list())
                   return true;
           }
           return false;
    }
    
    boolean N5(){
        if(N5.contains(tokens[i].getClassPart()) || tokens[i].getValuePart().equals("=")){
            if(obj()){
                if(tokens[i].getClassPart().equals("?")){
                    i++;
                    return true;
                }
                return true;
            }
            
            
            if(tokens[i].getClassPart().equals("(")){
                   i++;
                   if(Arguments())
                       if(tokens[i].getClassPart().equals(")")){
                           i++;
                           if(func_body())
                               return true;
                       }
                   
               }
        }
        return false;
    }
    
    boolean Start_CFG(){
        if(Start.contains(tokens[i].getClassPart())){
            if(Start())
                if(Start_CFG())
                    return true;
            return true;
        }
        return false;
    }
    
    private boolean IsValidIndex(String T) {
        if (!T.equals("INT_CONST")) {
            System.out.println("Invalid type");
            return false;
    }
        return true;
    }

    private boolean CanMemberBeAccessed(String T) {
        if(T==null){ 
            System.out.println("UNDECLARED VARIABLE "+ tokens[i].getLinenum());
            return false;
        }
        else 
            if(!T.equals("ID")){
                System.out.println("Dot not allowed here "+tokens[i].getLinenum());
                return false;
            }
        return true;
    
    }
/*
    private String IsExtend(String CC) {
        for (int j = 0; j < this.symbolTable.ClassAttribute.size(); j++) {
            if (!this.symbolTable.ClassAttribute.get(j).Name.equals(CC)) {
              return  this.symbolTable.ClassAttribute.get(j).Extends;
            }
        }
 

    return "";
    }
*

}
*/
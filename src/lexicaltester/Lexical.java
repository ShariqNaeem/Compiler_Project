/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicaltester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ShariQ
 */
public class Lexical {
        public  Token[] tokens;
    
    final private List<String> AM = Arrays.asList("protected","private", "public");
    final private List<String> DT = Arrays.asList("int","char","float","boolean");
    final private List<String> TF = Arrays.asList("true","false");
    final private List<String> selfKw = Arrays.asList("untill","for","do","class","static","void","extends",
            "switch","default","case","if","else","continue","break","final","abstract","final",
            "super","new","return","this");
    final private List<String> PM = Arrays.asList("+","-");
    final private List<String> MD = Arrays.asList("/","%","*");
    final private List<String> RO = Arrays.asList("<",">","<=",">=","!=","==");
    final private List<String> DI = Arrays.asList("++","--");
    final private List<String> AO = Arrays.asList("=","+=","-=","*=","/=","%=");
    final private List<String> selfOp = Arrays.asList("&&","||","^","!",".","@");
    final private List<String> punctuators = Arrays.asList("{","}","(",")","[","]",";",":",",","?");
//    final private List<String> terminator = Arrays.asList("?");
    
    private static Matcher m;
    final private Pattern id = Pattern.compile("[A-Za-z][A-Za-z0-9_]*");
    final private Pattern integer = Pattern.compile("[+-]?[0-9]+");
    final private Pattern flooat = Pattern.compile("[+-]?[0-9]*[.][0-9]+(e[+-]?[0-9]+)?");
    final private Pattern strring = Pattern.compile("\".*\"");
    final private Pattern chaar = Pattern.compile("'.'|'\\\\.'");
    
    
    final private List<Character> excluded = Arrays.asList(' ','\n','\r','\t');
    final private List<Character> included = Arrays.asList('?','+','-','*','/','%','<','>','=','&','|','^','!','.','{','}','(',')','[',']',';',':',',','"','\'','#','@');
    final private Pattern subflooat = Pattern.compile("[0-9]+(e[+-]?[0-9]+)?");
    
    
    public Lexical(String filePath) throws IOException {
		String code = readFile(filePath) ;
		FileWriter out = null;
		out = new FileWriter("token.txt");
		tokens=getTokens(code,included,excluded);
		for (int i = 0; i<tokens.length;i++) {
			out.write(tokens[i].toString());
			if(i<tokens.length-1)
                            out.write(System.getProperty("line.separator"));
			
                        if(tokens[i].getClassPart().equals("INVALID"))
				System.out.println("line # "+tokens[i].getLinenum()+": "+tokens[i].getValuePart()+" is an invalid word.");
		}
                
		if (out != null) 
                    out.close();
	}
    
    private String readFile(String fileName) throws IOException {
	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        while (line != null) {
	            sb.append(line);
	            sb.append(System.getProperty( "line.separator" ));
	            line = br.readLine();
	        }
	        return sb.toString();
	    	}
    }
    
    private Token [] getTokens(String code, List<Character> inc, List<Character> exc) {
        LinkedList<Token> tok=new LinkedList<Token>();
        StringBuilder temp;
        int ln=1;
        for (int i = 0; i < code.length();) {
            temp=new StringBuilder();
            char ccc=code.charAt(i);
            //<------------------Without Operator------------------------------------------>
            
                if(code.charAt(i)>=48&&code.charAt(i)<=57){
                while(!(inc.contains(code.charAt(i))) && !(exc.contains(code.charAt(i))) && i<code.length()-1){
                temp.append(code.charAt(i));
                i++;
            }if(code.charAt(i)=='.'&&(code.charAt(i-1)>=48&&code.charAt(i-1)<=57)){
                if(code.charAt(i+1)>=48&&code.charAt(i+1)<=57){
                     temp.append(code.charAt(i));
                     i++;
                     while((i<=code.length())&&(code.charAt(i)>=48&&code.charAt(i)<=57||code.charAt(i)>=65&&code.charAt(i)<=90)||code.charAt(i)>=97&&code.charAt(i)<=122){
                         if((code.charAt(i)=='e'||code.charAt(i)=='E')&&(code.charAt(i+1)=='+'||code.charAt(i+1)=='-')){
                               temp.append(code.charAt(i));
                               i++;
                               temp.append(code.charAt(i));
                               i++;
                         }
//                         else if((code.charAt(i-1)=='-'&&code.charAt(i)=='-'||code.charAt(i)=='+')||((code.charAt(i-1)=='+')&&(code.charAt(i)=='+')||code.charAt(i)=='-'))
                         else{
                         temp.append(code.charAt(i));
                         i++;
                         }
                     }
                }
            }
                          
            }
            else if(code.charAt(i)=='.'){
                if(code.charAt(i+1)>=48&&code.charAt(i+1)<=57){
                     temp.append(code.charAt(i));
                     i++;
                     while((i<=code.length())&&(code.charAt(i)>=48&&code.charAt(i)<=57||code.charAt(i)>=65&&code.charAt(i)<=90)||code.charAt(i)>=97&&code.charAt(i)<=122){
                         if((code.charAt(i)=='e'||code.charAt(i)=='E')&&(code.charAt(i+1)=='+'||code.charAt(i+1)=='-')){
                               temp.append(code.charAt(i));
                               i++;
                               temp.append(code.charAt(i));
                               i++;
                         }
//                         else if((code.charAt(i-1)=='-'&&code.charAt(i)=='-'||code.charAt(i)=='+')||((code.charAt(i-1)=='+')&&(code.charAt(i)=='+')||code.charAt(i)=='-'))
                         else{
                         temp.append(code.charAt(i));
                         i++;
                         }
                     }
                }
            }
            else{
            while(!(inc.contains(code.charAt(i))) && !(exc.contains(code.charAt(i))) && i<code.length()-1){
                
                temp.append(code.charAt(i));
                i++;
            }
            
            }
        
            if((!(inc.contains(code.charAt(i)))) && (!(exc.contains(code.charAt(i))))){
		temp.append(code.charAt(i));
		i++;
            }
            
            if (!temp.toString().isEmpty()){
		tok.add(new Token(null,temp.toString(),ln));
            }else{
                if(code.charAt(i)==10)ln++;
   
                
                //<------------------------FOR ++|+= ------------------------------------------------>
                else if(code.charAt(i)=='+' &&  i<code.length()-1)
                        if(code.charAt(i+1)=='+'|| code.charAt(i+1)=='='){
                            temp.append(code.charAt(i));
                            i++;
                            temp.append(code.charAt(i));
                            tok.add(new Token(null,temp.toString(),ln));
                        }else{
                            temp.append(code.charAt(i));
                            tok.add(new Token(null,temp.toString(),ln));
                        }
                    //<-------------------------FOR --|-= ------------------------------------------------------->
                    else if(code.charAt(i)=='-' &&  i<code.length()-1)
                            if(code.charAt(i+1)=='-'|| code.charAt(i+1)=='='){
                                temp.append(code.charAt(i));
                                i++;
                                temp.append(code.charAt(i));
                                tok.add(new Token(null,temp.toString(),ln));
                            }else{
                                temp.append(code.charAt(i));
                                tok.add(new Token(null,temp.toString(),ln));
                            }
                    
                    //<-------------------------FOR  /= and %= ------------------------------------------------------->
                    else if((code.charAt(i)=='/' || code.charAt(i)=='*' || code.charAt(i)=='%') && i<code.length()-1)
                            if(code.charAt(i+1)=='='){
                                temp.append(code.charAt(i));
                                i++;
                                temp.append(code.charAt(i));
                                tok.add(new Token(null,temp.toString(),ln));
                            }else{
                                temp.append(code.charAt(i));
                                tok.add(new Token(null,temp.toString(),ln));
                            }
                    //<---------------------------- FOR POINTER ** AND *= -------------------------------------------------------->
//                    else if((code.charAt(i)=='*') && i<code.length()){
//                        m=id.matcher(code.charAt(i+1)+"");
//                            if(code.charAt(i+1)=='='){
//                                temp.append(code.charAt(i));
//                                i++;
//                                temp.append(code.charAt(i));
//                                tok.add(new Token(null,temp.toString(),ln));
//                            }else if(code.charAt(i+1)=='*' && i<code.length()-1){
//                                m=id.matcher(code.charAt(i+2)+"");
//                                if(m.matches()){
//                                    temp.append(code.charAt(i));
//                                    i++;
//                                    temp.append(code.charAt(i));
//                                    i++;
//                                while(m.matches()){
//                                    temp.append(code.charAt(i));
//                                    i++;
//                                    m=id.matcher(code.charAt(i)+"");    
//                                }
//                                tok.add(new Token("Pointer",temp.toString(),ln));
//                                }else{
//                                    temp.append(code.charAt(i));
//                                    tok.add(new Token(null,temp.toString(),ln));
//                                }
//                            }else if(m.matches()){
//                                temp.append(code.charAt(i));
//                                i++;
//                                
//                                while(m.matches()){
//                                    temp.append(code.charAt(i));
//                                    i++;
//                                    m=id.matcher(code.charAt(i)+"");    
//                                }
//                                tok.add(new Token("Pointer",temp.toString(),ln));
//                            }else{
//                                temp.append(code.charAt(i));
//                                tok.add(new Token(null,temp.toString(),ln));
//                            }
//                    }
                    //<---------------------SINGLE COMMENT-------------------------------------------------->
                    else if(code.charAt(i)=='#' && code.charAt(i+1)=='#' && i<code.length()-1){
                                i+=2;
                                while(code.charAt(i)!='\r'){
                                    i++;
                                }
            }
                    //<---------------------MULTIPLE LINE COMMENT-------------------------------------------------->
                    else if(code.charAt(i)=='#'&& i<code.length()-1){
                            i++;
                            if(code.charAt(i)=='*'){
                                i++;
                                while(code.charAt(i)!='*'){
                                    if(code.charAt(i)==10)
                                        ln++;
                                    i++;
                                    if(code.charAt(i)=='*'){
                                        if(i<code.length() && code.charAt(i+1)=='#'){
                                            i=i+1;
                                            break;
                                        }else{
                                            i++;
                                        }
                                    }
                                }
                                
//                            if(i<code.length()){
//                                while(code.charAt(i)!='*' && code.charAt(i+1)!='#'){
//                                    i++;
//                                }i+=2;
                            }
                    }
                    //<-------------- FOR POINTER @@------------->
                    else if(code.charAt(i)=='@' && i<code.length()-1){
                        temp.append(code.charAt(i));
                        tok.add(new Token(null,temp.toString(),ln));
                    }
                    //<------------------------FOR != <= >= == --------------------------------------------------->
                    else if((code.charAt(i)=='!' ||code.charAt(i)=='<' || code.charAt(i)=='>' || code.charAt(i)=='=') && i<code.length()-1)
                            if(code.charAt(i+1)=='='){
                                temp.append(code.charAt(i));
                                i++;
                                temp.append(code.charAt(i));
                                tok.add(new Token(null,temp.toString(),ln));
                            }else{
                                temp.append(code.charAt(i));
                                tok.add(new Token(null,temp.toString(),ln));
                            }
                    
                   // <--------------------CONDTIONAL "&&"------------------------------->
                    else if(code.charAt(i)=='&' && i<code.length()-1)
                            if(code.charAt(i+1)=='&'){
                                temp.append(code.charAt(i));
				i++;
				temp.append(code.charAt(i));
				tok.add(new Token(null,temp.toString(),ln));
                            }
                            else{
				temp.append(code.charAt(i));
				tok.add(new Token(null,temp.toString(),ln));
			}
                    // <--------------------CONDTIONAL "||"------------------------------->
                    else if(code.charAt(i)=='|' && i<code.length()-1)
                            if(code.charAt(i+1)=='|'){
				temp.append(code.charAt(i));
				i++;
				temp.append(code.charAt(i));
				tok.add(new Token(null,temp.toString(),ln));
                            }
                            else{
				temp.append(code.charAt(i));
				tok.add(new Token(null,temp.toString(),ln));
                            }
                    
                    
                    
                    else if(punctuators.contains(code.charAt(i)+"") && i<code.length()-1){
                            temp.append(code.charAt(i));
                            tok.add(new Token(null,temp.toString(),ln));
                    }
                    //<----------------------------FOR STRING--------------------------------------------------->
                    else if(code.charAt(i)=='"'&& i<code.length()-1){
                        temp.append(code.charAt(i));
                        i++;
                        
                        while(code.charAt(i)!='"' && code.charAt(i)!='\r'){
                            if(code.charAt(i)=='\\'){
                                temp.append(code.charAt(i));
                                if(code.charAt(i+1)=='"'){
                                    i++;
                                    temp.append(code.charAt(i));
                                    i++;
                                }
                            }
                            temp.append(code.charAt(i));
                            i++;
                        }
                        if(code.charAt(i)=='"'){
                            temp.append(code.charAt(i));
                            
                        }
                        tok.add(new Token(null,temp.toString(),ln));
                    }
                    //<----------------------------FOR CHARACTER--------------------------------------------------------->
                    /*else if(code.charAt(i)=='\'' && i<code.length()-1){
                        temp.append(code.charAt(i));
                        ccc=code.charAt(i+1);
                        ccc=code.charAt(i+2);
                        if(code.charAt(i+1)=='\\' && (code.charAt(i+2)=='\'' || code.charAt(i+2)=='\\' || code.charAt(i+2)=='t' || code.charAt(i+2)=='r'
                                 || code.charAt(i+2)=='n') && code.charAt(i+3)=='\''){
                            temp.append(code.charAt(i+1));
                            temp.append(code.charAt(i+2));
                            temp.append(code.charAt(i+3));
                            i+=3;
                        }else if(code.charAt(i+2)=='\''){
                            temp.append(code.charAt(i+1));
                            temp.append(code.charAt(i+2));
                            i+=2;
                        }
                        tok.add(new Token(null,temp.toString(),ln));
                    }*/
                    else if (code.charAt(i)=='\''&& i<code.length()-1){
                            temp.append(code.charAt(i));
                            i++;
			
                            if(code.charAt(i)=='\\'){
                                temp.append(code.charAt(i));
				i++;
                            }
				temp.append(code.charAt(i));
				i++;
				temp.append(code.charAt(i));
				tok.add(new Token(null,temp.toString(),ln));
			}
                    
                    //<=====DOT====>
                    else if(code.charAt(i)=='.' && i<code.length()){
                        temp.append(code.charAt(i));
                        tok.add(new Token(null,temp.toString(),ln));
                    }
                    i++;
                }
                    
            }
        
        
        
        for (int i = 0; i < tok.size(); i++) {
                tok.get(i).setClassPart(validate(tok.get(i).getValuePart()));
            
        }
        
        for (int i = 0; i < tok.size(); i++) {
//            if(tok.get(i).getClass().equals("DT")){
//                if(tok.get(i+1).getClass().equals("[") && tok.get(i+2).getClass().equals("]")){
//                    tok.get(i).setValuePart(tok.get(i).getValuePart()+tok.get(i+1).getValuePart() + tok.get(i+2).getValuePart());
//                    tok.get(i).setClassPart("Array");
//                    tok.remove(i+1);
//                    tok.remove(i+2);
//                }
//            }

        }
        
        
        
        
        
        String newvp;
		for (int i = 0; i<tok.size();i++) {
			if(tok.get(i).getClassPart().equals(".") && i!=0 && i<tok.size()-1){
				m=subflooat.matcher(tok.get(i+1).getValuePart());
				if(m.matches() && tok.get(i-1).getClassPart().equals("INT_CONST")){
						newvp=tok.get(i-1).getValuePart()+"."+tok.get(i+1).getValuePart();
						tok.set(i, new Token(validate(newvp),newvp,tok.get(i).getLinenum()));
						tok.remove(i+1);
						tok.remove(i-1);
						i--;
				}
				else if(m.matches()){
					newvp="."+tok.get(i+1).getValuePart();
					tok.set(i, new Token(validate(newvp),newvp,tok.get(i).getLinenum()));
					tok.remove(i+1);
				}
			}
			else if(tok.get(i).getClassPart().equals(".") && i<tok.size()-1){
				m=subflooat.matcher(tok.get(i+1).getValuePart());
				if(m.matches()){
					newvp="."+tok.get(i+1).getValuePart();
					tok.set(i, new Token(validate(newvp),newvp,tok.get(i).getLinenum()));
					tok.remove(i+1);
				}
			}
		}
                
		tok.add(new Token("$",null,0));
                Token [] tokk = new Token[tok.size()];
		return tok.toArray(tokk);

        
      
    }
    
    
    private String validate (String vp){
        if(AM.contains(vp))
            return "AM";
	if(DT.contains(vp))
            return "DT";
	if(TF.contains(vp))
            return "BOOL_CONST";
	if(selfKw.contains(vp))
            return vp;
	if(PM.contains(vp))
            return "PM";
	if(MD.contains(vp))
            return "MMD";
	if(RO.contains(vp))
            return "ROP";
        if(DI.contains(vp))
            return "IncDec";
	if(AO.contains(vp))
            return "AO";
	if(selfOp.contains(vp))
            return vp;
	if(punctuators.contains(vp))
            return vp;
        if("string".equals(vp))
            return vp;
        
        
	m = id.matcher(vp);
	if (m.matches())
            return "ID";
	
        m = integer.matcher(vp);
	if (m.matches())
            return "INT_CONST";
	
        m = flooat.matcher(vp);
        if (m.matches())
            return "FLOAT_CONST";
	
        m = chaar.matcher(vp);
        if (m.matches())
            return "CHAR_CONST";
    	
        m = strring.matcher(vp);
	if (m.matches())
            return "STR_CONST";
        
	return "INVALID";
	}
        
    }


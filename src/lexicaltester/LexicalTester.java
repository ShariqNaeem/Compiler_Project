/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicaltester;

import java.io.IOException;

/**
 *
 * @author ShariQ
 */
public class LexicalTester {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Lexical lax=new Lexical("samplecode.txt");
        Lexical lax=new Lexical("sem.txt");
        Syntax syn=new Syntax(lax.tokens);
        syn.validate();
        
        int a=5;
        int b=3;
        
        if(a>=b){
            if(a<b){};
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicaltester;

/**
 *
 * @author ShariQ
 */
public class Token {
    private String classPart;
		private String valuePart;
		private int linenum;
		
		public Token(String classPart, String valuePart, int linenum) {
			this.classPart = classPart;
			this.valuePart = valuePart;
			this.linenum = linenum;
		}
		
		public String getClassPart() {
			return classPart;
		}

		public void setClassPart(String classPart) {
			this.classPart = classPart;
		}

		public String getValuePart() {
			return valuePart;
		}

		public void setValuePart(String valuePart) {
			this.valuePart = valuePart;
		}

		public int getLinenum() {
			return linenum;
		}

		public void setLinenum(int linenum) {
			this.linenum = linenum;
		}

		public String toString(){
			return "("+this.classPart+","+this.valuePart+","+this.linenum+")";
		}
}

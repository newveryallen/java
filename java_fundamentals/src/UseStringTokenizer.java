

import java.util.StringTokenizer;

public class UseStringTokenizer {

	public static void main(String[] args) {
		 	String fileRead = "cater        64/5/26 0939002302      5433343";
	        StringTokenizer tokens = new StringTokenizer(fileRead);
	                                                                                
	        System.out.println("�W��	�ͤ�	���	\t����");
	        while(tokens.hasMoreTokens()) {
	            System.out.print(tokens.nextToken() + "\t");
	        }
	        System.out.println("");
	}

}

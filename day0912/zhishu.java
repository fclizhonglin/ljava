package day0912;

public class zhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   char i, j, k;
	        for (i = 'x'; i <= 'z'; i++)
	            for (j = 'x'; j <= 'z'; j++) {
	                if (i != j)
	                    for (k = 'x'; k <= 'z'; k++) {
	                        if (i != k && j != k) {
	                            if (i != 'x' && k != 'x' && k != 'z')
	                                System.out.println("a VS "+i+",b VS "+ j+",c VS "+ k);
	                        }
	                    }
	            }
		
		
	}

}

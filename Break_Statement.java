package Jump_ControlStatement;

public class Break_Statement {

	public static void main(String[] args) {
		int i,j,k;
		a: for(i=0;i<=10;i++) {
			b: for(j=0;j<=20;j++) {
				c: for(k=0;k<30;k++) {
					System.out.println(k);
					if(k==5) {
						break b;
					}
				}
			}
		}

	}

}

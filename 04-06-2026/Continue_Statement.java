package Jump_ControlStatement;

public class Continue_Statement {

	public static void main(String[] args) {
			int i;
			int j;
			a: for(i=1;i<10;i++) {
				b: for(j=1;j<10;j++) {
					if(j==2) {
						continue;
					}
					System.out.println(j);
				}
			}

	}

}

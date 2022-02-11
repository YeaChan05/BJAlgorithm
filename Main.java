import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
	    while(line!=null) { 
			StringTokenizer st = new StringTokenizer(line, " ");
			int temp=0;
			while(st.hasMoreTokens()) {
					temp+=Integer.parseInt(st.nextToken());
				}
				System.out.println(temp);
				line=br.readLine();
	    }
	}
}

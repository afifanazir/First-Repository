
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="Hello World", decrypt="igopt&^w{v0";
		char c;
		char store;
		for(int i=0; i<message.length();i++)
		{
			c=message.charAt(i);
			store=(char)(c+i+1);
			System.out.print(store);
		}
		System.out.println();
		for(int i=0; i<decrypt.length(); i++)
		{
			c=decrypt.charAt(i);
			c = (char) (c - i - 1);
            System.out.print(c);
		}

	}

}

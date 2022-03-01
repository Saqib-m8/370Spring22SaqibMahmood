package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {

	private String myString= null;

	
	
	@Override
	public String getString() {
		
		return myString;
	}

	@Override
	public void setString(String string) {
		myString= string;

	}

	@Override
	public int countNumbers() throws NullPointerException {
		String str = this.myString;
		if(str.matches(".*\\d.*"))

		{

		str = str.replaceAll("[^0-9]+", " ");
		String[] string = str.trim().split(" ");
			return string.length;
		}

		else{
			return 0;
		}
		
		
	}

	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) throws NullPointerException , IllegalArgumentException{
		
		
		if (myString == null && n >0 ) { // if myString != null && n <= 0 will be covered by the next one automatically
			throw new NullPointerException();
		}
		
		if (n <=0 ) {
			throw new IllegalArgumentException();
		}
		
		if (myString == "" || myString.length()<n) {
			return "";
		}
		
		
		String end="";
		int up= 1;
		
		for (int i=n; i<=myString.length();) {
			
			if (startFromEnd == false) {
				end = end + myString.charAt(i-1);
			}
			
			
			else {
				int diff= myString.length()-(i);
				//System.out.println(diff);
				end = myString.charAt(diff) + end;

			}
			
			up++;
			i= up*n;
		}
		
		
		
		return end;
	}

	@Override
	public void convertDigitsToNamesInSubstring(int start, int end) throws IllegalArgumentException, MyIndexOutOfBoundsException, NullPointerException {


        if(start > end) {
            throw  new IllegalArgumentException();
        } else if ( start < 1 || start > myString.length() || end < 1 || end > myString.length() ) {
            throw  new MyIndexOutOfBoundsException();
        } else if (myString == null) {
            throw  new NullPointerException();
        }

        start = start - 1;
        end = end - 1;
        StringBuffer SB = new StringBuffer();
        char[] C = myString.toCharArray();

        for (int i = 0; i < C.length; i++) {

            if ( i >= start && i <= end) {
                switch (C[i]) {
                    case '0':
                        SB.append("Zero");
                        break;
                    case '1':
                        SB.append("One");
                        break;
                    case '2':
                        SB.append("Two");
                        break;
                    case '3':
                        SB.append("Three");
                        break;
                    case '4':
                        SB.append("Four");
                        break;
                    case '5':
                        SB.append("Five");
                        break;
                    case '6':
                        SB.append("Six");
                        break;
                    case '7':
                        SB.append("Seven");
                        break;
                    case '8':
                        SB.append("Eight");
                        break;
                    case '9':
                        SB.append("Nine");
                        break;
                    default:
                        SB.append(C[i]);
                        break;
                }
            } else {
                SB.append(C[i]);
            }
        }
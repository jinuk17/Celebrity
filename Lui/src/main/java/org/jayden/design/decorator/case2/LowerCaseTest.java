package org.jayden.design.decorator.case2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseTest {

	public static void main(String[] args) {
		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(System.in));
		
			while((c=in.read())>=0) {
				System.out.println((char)c);
			}
			
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

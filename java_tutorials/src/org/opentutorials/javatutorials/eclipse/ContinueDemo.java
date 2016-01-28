package org.opentutorials.javatutorials.eclipse;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("Coding Everybody " + i);
        }
	}
}

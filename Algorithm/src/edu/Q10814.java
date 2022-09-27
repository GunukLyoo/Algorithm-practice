package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class agename{
	private int age;
	private String name;
	
	public agename() {
		age = 0;
		name = "";
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	} 
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Q10814 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		
		n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		agename[] arr = new agename[n];
		String[] str;
		
		while(c<n) {
			str = br.readLine().split(" ");
			arr[c] = new agename();
			arr[c].setAge(Integer.parseInt(str[0]));
			arr[c].setName(str[1]);
			c = c + 1;
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if(((agename) o1).getAge() != ((agename) o2).getAge()) {
				return ((agename) o1).getAge() - ((agename) o2).getAge();
			}else {
				return 0;
			}
		});
		
		c = 0;
		
		while(c<n) {
			bw.write(Integer.toString(arr[c].getAge()) + " " + arr[c].getName() + "\n");
			c = c + 1;
		}		

		bw.close();
	}

}

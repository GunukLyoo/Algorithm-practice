package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q17478 {
	
	static void recursive(int n, int c, String str, BufferedWriter bw) throws Exception{
		if(c>0) str = str + "____";
		
		bw.write(str + "\"����Լ��� ������?\"\n");
		
		if(c < n) {
			bw.write(str + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
			bw.write(str + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
			bw.write(str + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
			recursive(n, c+1, str, bw);
		}else if(c == n) {
			bw.write(str + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
		}
		
		bw.write(str + "��� �亯�Ͽ���.\n");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		bw.write("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		recursive(n, 0, "", bw);

		bw.close();
	}

}

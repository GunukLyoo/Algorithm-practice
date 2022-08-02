package edu;

class Test {

	public long sum(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		
		return sum;
	}

}

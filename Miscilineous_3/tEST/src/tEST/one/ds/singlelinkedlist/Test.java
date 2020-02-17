package tEST.one.ds.singlelinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(2);
//		list.add(3);
//		list.add(10);
//		list.add(2);
//
//		list.add(4);
//		list.add(8);
//		list.add(1);
//
//		long maxDiff =0;
//		for(int i=1;i<list.size();i++) {
//			for(int j=0;j<i;j++) {
//				long diff = list.get(i)-list.get(j) ;
//				if(diff>maxDiff) {
//					maxDiff = diff;
//				}
//			}
//			
//		}
//		
		int x = 8;
		String abc = Integer.toBinaryString(x);
		//System.out.println(Integer.toBinaryString(x));
		char[] ch = abc.toCharArray();
		int count = 0;
		for(int i=0;i<ch.length-1;i++) {

			boolean flag = true;
			if(ch[i]=='0' && ch[i+1] =='1') {
				for (int j = i; j < ch.length; j++) {
					if (ch[j] != 0) {
						flag = false;
						break;
					}

				}
				
				if(flag) {
					ch[i] = '1';
					count++;
				}
				
				if(i==ch.length-1) {
					if(ch[i]=='0') {
						ch[i]='1';
						count++;
					}else {
						ch[i] = '0';
						count++;
					}
					
				}
			}


			
		}
		
		String str = new String(ch);
		System.out.println(str);
		System.out.println(count);
		

	}

}

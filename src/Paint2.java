/*
 * �ó���ʵ�������ε������Ҫ��
��1���ܴ������в�����ȡ�����εĸ߶�
��2��ʹ���ַ���Ϊ�����ε����
��3��ʵ������һ���Զ���Exception
��4������Exception����
     		  *
     		 6 6
     		5   5
     	   4     4
     	  3       3
     	 2         2
     	*************
 */
class MyException2 extends Exception{
	public MyException2(String detail) {
		super(detail);
	}
}

class Draw2{
	public void printTri(int h) {
		int j;
		Paint p=new Paint();
		for(int i=0;i<h;i++) {
			if(i<h-1) {//������һ��ǰ���������֡��ո����ֵ���ʽ
				for(j=0;j<h-i-1;j++) {
					System.out.print(" ");
				}
				for(int k=j;k<h+i;k++) {
					if(k==j||k==h+i-1) {
						if(i==0) {
							System.out.print("*");
						}
						else {
							System.out.print(h-i);
						}	
					}
					
					else {
						System.out.print(" ");
					}
			    }
			    System.out.println();
			}
			else {
				for(int end=0;end<h+i;end++) {
					System.out.print("*");
				}
			}
		}
		
	}
}

public class Paint2 {
	static int getHight(String[] args) throws MyException2 {
		// TODO Auto-generated method stub
		int height;
		if(args.length==0) 
			 throw new MyException2("δ����ߵͲ�����");
		height=Integer.parseInt(args[0]);
		return height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0;
		try {
			h=getHight(args);
		}
		/*δ�������exception*/	
		catch(MyException2 e) {	
//			System.out.println("�����쳣Ϊ��"+e);
			e.printStackTrace(System.out);
		} 
		/*����Ƿ�����exception*/
		catch(NumberFormatException e2) {
			System.out.println("����Ƿ��߶Ȳ�����");
			System.out.println("�����쳣Ϊ��"+e2);
			e2.printStackTrace(System.out);
		}
		Draw2 dr=new Draw2();
		try {
			dr.printTri(h);
		}
		catch(Exception e3) {
			e3.printStackTrace(System.out);
		}
	}

}

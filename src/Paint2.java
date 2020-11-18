/*
 * 用程序实现三角形的输出，要求：
（1）能从命令行参数读取三角形的高度
（2）使用字符作为三角形的外框
（3）实现至少一处自定义Exception
（4）进行Exception控制
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
			if(i<h-1) {//输出最后一行前的行是数字、空格、数字的形式
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
			 throw new MyException2("未输入高低参数！");
		height=Integer.parseInt(args[0]);
		return height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0;
		try {
			h=getHight(args);
		}
		/*未输入参数exception*/	
		catch(MyException2 e) {	
//			System.out.println("触发异常为："+e);
			e.printStackTrace(System.out);
		} 
		/*输入非法参数exception*/
		catch(NumberFormatException e2) {
			System.out.println("输入非法高度参数！");
			System.out.println("触发异常为："+e2);
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

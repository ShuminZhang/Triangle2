/*
 1.用程序实现三角形的输出，要求：（1）能从命令行参数读取三角形的高度
（2）使用数字作为三角形的外框
（3）实现至少一处自定义Exception
（4）进行Exception控制
       例子：java example 7
               1
              2 2
             3   3
            4     4
           5       5
          6         6
         7777777777777
 *
 */
class MyException extends Exception{
	public MyException(String detail) {
		super(detail);
	}
}

class Draw{
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
						System.out.print(i+1);
					}
					
					else {
						System.out.print(" ");
					}
			    }
			    System.out.println();
			}
			else {
				for(int end=0;end<h+i;end++) {
					System.out.print(i+1);
				}
			}
		}
		
	}
}

public class Paint {
	static int getHight(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int height;
		if(args.length==0) 
			 throw new MyException("未输入高低参数！");
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
		catch(MyException e) {	
//			System.out.println("触发异常为："+e);
			e.printStackTrace(System.out);
		} 
		/*输入非法参数exception*/
		catch(NumberFormatException e2) {
			System.out.println("输入非法高度参数！");
			System.out.println("触发异常为："+e2);
			e2.printStackTrace(System.out);
		}
		Draw dr=new Draw();
		try {
			dr.printTri(h);
		}
		catch(Exception e3) {
			e3.printStackTrace(System.out);
		}
	}

}

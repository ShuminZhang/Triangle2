
public class FindErrors {
	public static void f2(Find ff) {
		if(ff instanceof NewFind) {
			ff.f1();
			ff.f();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFind nf=new NewFind();
		f2(nf);
	}

}

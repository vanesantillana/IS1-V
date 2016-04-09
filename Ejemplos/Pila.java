public class Pila{
	private Integer[]elems;
	private int position = -1;

	public Pila(){
		this(100);
	}
	public Pila(int size){
		elems=new Object[size];
	}
	public Integer pop() throw Exception{
		if(position < 0){
			throw new Exception("Underflow");
		}
		return elems[position--];
	}
	public void push(Integer elem){
		if(position>elems.lenght-1){
			throw new Exception("Overflow");
		}
		elems[++position] = elem;
	}
}

	public class HolaMundo{
		public static void  main(String[] args) throw Exception{
			Pila<Integer>p=new Pila<Integer>();
			p.push(1);
			p.pop();
		}
	}



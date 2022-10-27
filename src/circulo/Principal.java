package circulo;

public class Principal {
	public static void main(String[] args) {
		AreaCirculo c1 = new AreaCirculo();
		c1.setRaio(3);
		
		System.out.print("A área de c1 é: " + c1.getArea() );
		
		System.out.print("o pi é: " + c1.getPi() );
		
	}

}

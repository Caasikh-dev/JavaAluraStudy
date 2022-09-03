
public class TesteSaca {
public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente(111, 111);
	
	cc.deposita(200.0);
	try {
	cc.saca(210.0);
	}catch(SaldoInsuficienteException ex){
		System.out.println(ex.getMessage());
	}
	
	System.out.println(cc.getSaldo());
}
}

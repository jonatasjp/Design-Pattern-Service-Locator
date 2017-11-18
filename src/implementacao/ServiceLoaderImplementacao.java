package implementacao;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ServiceLoaderImplementacao {

	public static void main(String[] args) {
		
		ServiceLoader<Abstracao> sl = ServiceLoader.load(Abstracao.class);
		Iterator<Abstracao> i = sl.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().getClass().getName());
		}

	}
}

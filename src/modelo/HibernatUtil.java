package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernatUtil {

	private static SessionFactory sf;
	
	static{
		//classe que configura e cria a fábrica de sessão
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		//informa com o método configure que o arquivo
		//hibernate.cfg.xml contém as infos para estabelecimento
		//da conexão com o banco
		cfg.configure("hibernate.cfg.xml");
		//o método buildSessionFactory() instancia a 
		//fábrica de sessão
		sf = cfg.buildSessionFactory();
	}
	
	public static Session getSession(){
		return sf.openSession();
	}
	
	
}





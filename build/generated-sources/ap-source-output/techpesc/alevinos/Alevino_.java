package techpesc.alevinos;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import techpesc.fornecedor.Fornecedor;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Alevino.class)
public abstract class Alevino_ {

	public static volatile SingularAttribute<Alevino, Fornecedor> fornecedor;
	public static volatile SingularAttribute<Alevino, Short> qtdAlevino;
	public static volatile SingularAttribute<Alevino, Short> idEntradaAlevino;
	public static volatile SingularAttribute<Alevino, Double> pesoAlevino;
	public static volatile SingularAttribute<Alevino, Date> dataNascimentoAlevino;
	public static volatile SingularAttribute<Alevino, Double> valorAlevino;
	public static volatile SingularAttribute<Alevino, Date> dataEntrada;

}


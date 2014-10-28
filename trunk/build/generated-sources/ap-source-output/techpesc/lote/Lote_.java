package techpesc.lote;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import techpesc.alevinos.Alevino;
import techpesc.tanquerede.TanqueRede;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lote.class)
public abstract class Lote_ {

	public static volatile SingularAttribute<Lote, Date> previsaoAbate;
	public static volatile SingularAttribute<Lote, Double> lucroEstimado;
	public static volatile SingularAttribute<Lote, Short> idLote;
	public static volatile ListAttribute<Lote, TanqueRede> tanquesRede;
	public static volatile SingularAttribute<Lote, Alevino> alevino;
	public static volatile SingularAttribute<Lote, String> nomeLote;

}


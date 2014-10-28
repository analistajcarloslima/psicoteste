package techpesc.funcionario;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ {

	public static volatile SingularAttribute<Funcionario, String> nomeFuncionario;
	public static volatile SingularAttribute<Funcionario, String> contato;
	public static volatile SingularAttribute<Funcionario, Double> salario;
	public static volatile SingularAttribute<Funcionario, String> cpf;
	public static volatile SingularAttribute<Funcionario, Date> dataNascimento;
	public static volatile SingularAttribute<Funcionario, Short> idFuncionario;

}


# Hibernate Tutorial
Hibernate is a Java framework that maps an object-oriented model to a database.

In Hibernate.cfg.xml is specified the database connection driver, url, username and password.
In pom.xml are specified the dependencies. 

Annotations:
@Entity - Specifies that the class is an entity. This annotation is applied to the entity class.
@Table – Specifies the primary table
@secondaryTable – Specifie secondary tables
@Id - Specifies the primary key of an entity. 
The @GeneratedValue annotation is used when you want Hibernate to assign the entity identifier automatically using either:
•	IDENTITY column
•	a SEQUENCE
•	or a TABLE generator
If you don’t use the @GeneratedValue annotation, then the identifier must be manually assign.
The IDENTITY generator allows an integer/bigint column to be auto-incremented on demand. The increment process happens outside of the current running transaction, so a roll-back may end-up discarding already assigned values (value gaps may happen).
A SEQUENCE is a database object that generates incremental integers on each successive request. 
The table generator allows JDBC batching but it resorts to SELECT FOR UPDATE queries. The row level locking is definitely less efficient than using a native IDENTITY or SEQUENCE.
@Column - Specifies the mapped column for a persistent property or field. If no Column annotation is specified, the default values apply.
@PrimaryKeyJoinColumn - Specifies a primary key column that is used as a foreign key to join to another table.
@Embedable - Specifies a class whose instances are stored as an part of an owning entity . exp: Address in the address class before declaration.
@Embedded - Specifies a field of an entity whose value is an instance of an embeddable class. Exp: Addres in the Employee class
@OneToOne – Specifie an one to one relation
@ManyToMany – Specifie an many to many relation

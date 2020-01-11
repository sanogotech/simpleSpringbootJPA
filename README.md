# simpleSpringbootJPA

## Tutorials/Urls
- https://hellokoding.com/jpa-one-to-many-relationship-mapping-example-with-spring-boot-hsql/

- https://dev.to/martinbelev/how-to-enable-junit-5-in-new-spring-boot-project-29a8

## Definition

* @Table maps the entity with the table. If no @Table is defined, the default value is used: the class name of the entity.

* @Id declares the identifier property of the entity.

* @Column maps the entity's field with the table's column. If @Column is omitted, the default value is used: the field name of the entity.

* @OneToMany and @ManyToOne defines a one-to-many and many-to-one relationship between 2 entities. 

* @JoinColumn indicates the entity is the owner of the relationship: the corresponding table has a column with a foreign key to the referenced table.

* mappedBy indicates the entity is the inverse of the relationship.

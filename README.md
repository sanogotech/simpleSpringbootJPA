# simpleSpringbootJPA

## Tutorials/Urls
- https://www.oracle.com/technical-resources/articles/vasiliev-jpql.html
- https://hellokoding.com/jpa-one-to-many-relationship-mapping-example-with-spring-boot-hsql/

- https://dev.to/martinbelev/how-to-enable-junit-5-in-new-spring-boot-project-29a8

## HTML Form Elements

Most form elements have been demonstrated. 
* `<input type="text" ...`   // simple text field
* `<textarea ...`     // multiline textarea
* `<input type="datetime-local" ...`   // datetime field
* `<input type="color" ...`   // color selector
* `<input type="checkbox" ...`  // single checkbox
* `<ul><li><input type="checkbox" ...`  // set of checkboxes
* `<ul><li><input type="radio" ...` // set of mutually exclusive checkboxes.
* `<select ...><option value=" ...` // dropdown list of values.

## @ModelAttribute 

Also demonstrate 2 usecases to apply @ModelAttribute...
1. Pre-populating the Model with the set of values needed for multi-select form elements.
    * example: selectable values for checkbox sets, radio sets, dropdown lists. 
2. Application of the Command Pattern to represent the MVC state (the 'FormCommand' object).

## Definition

* @Table maps the entity with the table. If no @Table is defined, the default value is used: the class name of the entity.

* @Id declares the identifier property of the entity.

* @Column maps the entity's field with the table's column. If @Column is omitted, the default value is used: the field name of the entity.

* @OneToMany and @ManyToOne defines a one-to-many and many-to-one relationship between 2 entities. 

* @JoinColumn indicates the entity is the owner of the relationship: the corresponding table has a column with a foreign key to the referenced table.

* mappedBy indicates the entity is the inverse of the relationship.

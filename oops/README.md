### Access Modifiers
```
public class Main
```
The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

We divide modifiers into two groups:

Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality

#### For classes 
`public`	The class is accessible by any other class	
`default`	The class is only accessible by classes in the same package. This is used when you don't specify a modifier. 

#### For attributes, methods and constructors
`public`	The code is accessible for all classes	
`private`	The code is only accessible within the declared class	
`default`	The code is only accessible in the same package. This is used when you don't specify a modifier. 
`protected`	The code is accessible in the same package and subclasses

### Super Class

It is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.


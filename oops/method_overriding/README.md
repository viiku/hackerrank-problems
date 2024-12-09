### Java Method Overriding
When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones).

```
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
```

Next, we create a Soccer class that inherits from the Sports class. We can override the getName method and return a different, subclass-specific string:

```
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
```
Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.

Here are the key points to understand method overriding in Java:

1. Method Signature: To override a method, the subclass's method must have the same method signature as the method in the superclass. The method signature consists of the method name, its parameter list, and the return type.

2. Access Modifier: The overridden method in the subclass must not have a more restrictive access modifier than the method in the superclass. It can have the same or a less restrictive access modifier.

3. @Override Annotation: While not mandatory, it's a good practice to use the @Override annotation when overriding a method. It helps the compiler catch errors if you make a mistake in the method signature.

#### Overriding Final Method
What happens if a subclass attempts to override a final method from the superclass?

Final methods cannot be overridden in Java. If a subclass attempts to override a final method, a compilation error will occur.

### Method Overriding Access Modifiers :- Key Rules for Method Overriding Access Modifiers:
Visibility Can Increase but Not Decrease:

1. The access level of the overriding method cannot be more restrictive than the method in the superclass.

For example:
If a superclass method is protected, the overriding method in the subclass can be protected or public, but not private or default (package-private).
If a superclass method is public, the overriding method must be public (cannot reduce visibility).

### Super keyword
When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.
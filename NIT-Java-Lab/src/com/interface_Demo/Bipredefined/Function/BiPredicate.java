package com.interface_Demo.Bipredefined.Function;

public interface BiPredicate<T,U> {
	boolean test(T t,U u);
	
}
//T - the type of the first argument to the predicate 
//U - the type of the second argument the predicate
//Note : return type is boolean.

package com.collections.Tasks.day;

public sealed interface Vehicle permits Car ,Bike{
	void run();
}

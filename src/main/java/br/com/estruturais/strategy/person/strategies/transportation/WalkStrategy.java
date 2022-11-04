package br.com.estruturais.strategy.person.strategies.transportation;

import br.com.estruturais.strategy.person.strategies.transportation.TransportationStrategy;

public class WalkStrategy implements TransportationStrategy {

	@Override
	public void move() {
		System.out.println("I walk to go anywhere");
	}

}

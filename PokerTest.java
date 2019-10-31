package main.poker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PokerTest {
	
	public Poker sut=new Poker("2H 3D 5S KC KD","2C 3H 4S 8C AH");
	public Poker sut1=new Poker("2H 3D 5S 8C KD","2C 3H 4S AC AH");
	public Poker sut2=new Poker("2H 3D 5S 9C KD","2C 3H 4S 8C AH");
	public Poker sut3=new Poker("2H 3D 5S 9C KD","2C 3H 4S 8C 2C");
	public Poker sut4=new Poker("2H 3D 3S KC KD","2C 3H 4S 8C AH");
	public Poker sut5=new Poker("2H 3D 5S 8C KD","2C 3H 3S AC AH");
	public Poker sut6=new Poker("2H 3D KS KC KD","2C 3H 4S 8C AH");
	public Poker sut7=new Poker("2H 3D 5S 8C KD","2C 3H AS AC AH");
	public Poker sut8=new Poker("2H 2D 2S 2C KD","2C 3H 4S 8C AH");
	public Poker sut9=new Poker("2H 3D 5S 8C KD","2C 2H 2S 2D KH");
	@Test
	void testpar() {
		assertEquals(true,sut.par(sut.m1,sut.m2));
	}
	@Test
	void testpar2() {
		assertEquals(true,sut1.par(sut1.m1,sut1.m2));
	}
	
	@Test
	void testcartaAlta() {
		assertEquals(true,sut2.cartaAlta(sut2.m1,sut2.m2));
	}
	@Test
	void testcartaAlta2() {
		assertEquals(true,sut3.cartaAlta(sut3.m1,sut3.m2));
	}
	@Test
	void testdoblePar() {
		assertEquals(true,sut4.doblePar(sut4.m1,sut4.m2));
	}
	@Test
	void testdoblePar2() {
		assertEquals(true,sut5.doblePar(sut5.m1,sut5.m2));
	}
	
	@Test
	void testtrio() {
		assertEquals(true,sut6.doblePar(sut6.m1,sut6.m2));
	}
	@Test
	void testtrio2() {
		assertEquals(true,sut7.doblePar(sut7.m1,sut7.m2));
	}
	
	@Test
	void testpoker() {
		assertEquals(true,sut8.doblePar(sut8.m1,sut8.m2));
	}
	@Test
	void testpoker2() {
		assertEquals(true,sut9.doblePar(sut9.m1,sut9.m2));
	}
}

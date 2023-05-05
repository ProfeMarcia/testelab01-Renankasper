package com.example.project;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LojaTest {
	@Test
	public void tamanhoDaLoja1() {
		Loja l = new Loja(null, 0, 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005D);
		char expected = 'P';
		char actual = l.tamanhoDaLoja();

		assertEquals(expected, actual);
	}

	@Test
	public void tamanhoDaLoja3() {
		Loja l = new Loja(null, 31, 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005D);
		char expected = 'G';
		char actual = l.tamanhoDaLoja();

		assertEquals(expected, actual);
	}

	@Test
	public void tamanhoDaLoja2() {
		Loja l = new Loja(null, 10, 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005D);
		char expected = 'M';
		char actual = l.tamanhoDaLoja();

		assertEquals(expected, actual);
	}
}
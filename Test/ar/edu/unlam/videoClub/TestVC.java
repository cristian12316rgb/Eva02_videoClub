package ar.edu.unlam.videoClub;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVC {

	@Test
	public void test() {

		VideoClub mania=new VideoClub("VideoMania");
		Cliente yo=new ClientePremium("Gerardo",1,18,30d);
		
		assertTrue(mania.agregarCliente(yo));
		assertFalse(mania.queSeaDeLaClaseClientePremium());
	}

}
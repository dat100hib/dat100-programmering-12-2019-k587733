package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		boolean skrevet = false;
		
		try {
			PrintWriter blogg = new PrintWriter(filnavn);
			String navntab = samling.toString();
			for (int i = 0; i < navntab.length(); i++) {
				blogg.println();
				skrevet = true;
				
			}
			blogg.close();
			
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Filen kan ikke åpnes");
		}
		return skrevet;
	}
}

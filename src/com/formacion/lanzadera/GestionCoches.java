package com.formacion.lanzadera;

import javax.swing.JOptionPane;

import com.formacion.entidades.Coche;

public class GestionCoches {

	public static void main(String[] args) {
		// datos para alta de coche
		String modelo = JOptionPane.showInputDialog("Introduzca modelo");
		String matricula = JOptionPane.showInputDialog("Introduzca matricula");
		// creación de coche c1
		Coche c1 = new Coche(modelo, matricula);
		// modificacion de coche c1 por set - color
		c1.setColor(JOptionPane.showInputDialog("Introduzca color"));
		// modificacion de coche mediante metodo - sector
		menuSector(c1);
		// modificacion de coche mediante metodo - seguro
		menuSeguro(c1);
		// prints de verificacion de coche c1
		JOptionPane.showMessageDialog(null, c1);
		JOptionPane.showMessageDialog(null, "El coche " + c1.getModelo() + " es del sector " + c1.getSector());
		JOptionPane.showMessageDialog(null,
				"El coche con matricula " + c1.getMatricula() + " tiene seguro " + c1.getSeguro());
	}

	private static void menuSeguro(Coche codigo) {
		boolean acceso = true;
		while (acceso) {
			int opcion = 0;
			try {
				opcion = Integer.parseInt(
						JOptionPane.showInputDialog("Selecciones un tipo de seguro: 1.a terceros - 2.a todo riesgo"));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "La opcion no es un numero.");
				e.printStackTrace();
			}
			switch (opcion) {
			case 1:
				codigo.setSeguro("a terceros");
				acceso = false;
				break;
			case 2:
				codigo.setSeguro("a todo riesgo");
				acceso = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Te has equivocado de opción! vuelve a intentarlo.");
				break;
			}
		}

	}

	private static void menuSector(Coche codigo) {
		boolean acceso = true;
		while (acceso) {
			int opcion = 0;
			try {
				opcion = Integer.parseInt(JOptionPane
						.showInputDialog("Seleccione una opcion: 1.Mini - 2.Utilitario - 3.Familiar - 4.Deportivo"));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "La opcion no es un numero.");
				e.printStackTrace();
			}
			switch (opcion) {
			case 1:
				codigo.setSector("Mini");
				acceso = false;
				break;
			case 2:
				codigo.setSector("Utilitario");
				acceso = false;
				break;
			case 3:
				codigo.setSector("Familiar");
				acceso = false;
				break;
			case 4:
				codigo.setSector("Deportivo");
				acceso = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Te has equivocado de opción! vuelve a intentarlo.");
				break;
			}
		}
	}
}

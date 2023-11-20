package negocio;

import java.util.Scanner;

import dados.Dados;

public class Teste {
	private static Dados dados = new Dados();
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		dados.NovosDados();
		System.out.println(Dados.getnCnhs());
}
	
	public static void listarUsuarios() {
		for(int i = 0; i < Dados.getnUsuarios(); i++) 
			System.out.println(i + " -> " + Dados.getUsuarios()[i].toString());
		}
	
	public static void listarUsuariosPorNome() {
		for(int i = 0; i < Dados.getnUsuarios(); i++) 
			System.out.println(i + " -> " + Dados.getUsuarios()[i].getNome());
		}
	
	public static void listarCnhs() {
		for(int i = 0; i < Dados.getnCnhs(); i++) 
			System.out.println(i + " -> " + Dados.getCnhs()[i].toString());
		}
	public static void listarCnhsPorNumero() {
		for(int i = 0; i < Dados.getnCnhs(); i++) 
			System.out.println(i + " -> " + Cnh.getNumCnh());
		}
	
	public static void listarInfracoes() {
		for (int i = 0; i < dados.getnInfracoes(); i++) {
			System.out.println(i+ " -> " + dados.getInfracoes()[i].toString());
		}
	}
	
	public static void listarVeiculos() {
		for(int i = 0; i < dados.getnVeiculos(); i++) 
			System.out.println(i + " -> " + dados.getVeiculos()[i].toString());
		}
	
	public static void listarAutomoveisComEixo() {
		for(int i = 0; i < dados.getnAutosComEixo(); i++) 
			System.out.println(i + " -> " + dados.getAutosComEixo()[i].toString());
		}
	
	public static void listarCaminhoes() {
		for(int i = 0; i < dados.getnCaminhoes(); i++) 
			System.out.println(i + " -> " + dados.getCaminhoes()[i].toString());
		}
	
	public static void listarMotos() {
		for(int i = 0; i < dados.getnMotos(); i++) 
			System.out.println(i + " -> " + dados.getMotos()[i].toString());
		}

	public static void listarCarros() {
		for(int i = 0; i < dados.getnCarros(); i++) 
			System.out.println(i + " -> " + dados.getCarros()[i].toString());
		}
	
	public static void listarVans() {
		for(int i = 0; i < dados.getnVans(); i++) 
			System.out.println(i + " -> " + dados.getVans()[i].toString());
		}
	
}
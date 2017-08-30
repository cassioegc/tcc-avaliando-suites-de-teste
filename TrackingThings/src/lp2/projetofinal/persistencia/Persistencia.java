package lp2.projetofinal.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;

import lp2.projetofinal.entidades.ChaveNomeTelefone;
import lp2.projetofinal.entidades.Emprestimo;
import lp2.projetofinal.entidades.Usuario;

public class Persistencia {

	public static void salvarEmprestimos(List<Emprestimo> emprestimos) {

		try {

			FileOutputStream fos = new FileOutputStream("data/emprestimos.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emprestimos);

			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static List<Emprestimo> carregaEmprestimos() {

		try {

			File arquivo = new File("data/emprestimos.dat");
			if(!arquivo.exists())
				arquivo.createNewFile();
			
			FileInputStream fis = new FileInputStream(arquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<Emprestimo> emprestimos = (List<Emprestimo>) ois.readObject();

			ois.close();
			return emprestimos;

		} catch (IOException e) {
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;

	}

	public static Map<ChaveNomeTelefone, Usuario> carregaUsuarios() {

		try {
			
			File arquivo = new File("data/usuarios.dat");
			if(!arquivo.exists())
				arquivo.createNewFile();
			
			FileInputStream fis = new FileInputStream(arquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			Map<ChaveNomeTelefone, Usuario> usuarios = (Map<ChaveNomeTelefone, Usuario>) ois.readObject();

			ois.close();
			return usuarios;

		} catch (IOException e) {
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;

	}

	public static void salvarUsuarios(Map<ChaveNomeTelefone, Usuario> usuarios) {

		try {

			FileOutputStream fos = new FileOutputStream("data/usuarios.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(usuarios);
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

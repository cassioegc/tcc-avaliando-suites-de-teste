package lp2.projetofinal.persistencia;

import java.io.BufferedOutputStream;
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
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);

			oos.writeInt(emprestimos.size());
			oos.writeObject(emprestimos);

			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static List<Emprestimo> carregaEmprestimos() {

		try {

			FileInputStream fis = new FileInputStream("data/emprestimos.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			List<Emprestimo> emprestimos = (List<Emprestimo>) ois.readObject();

			ois.close();
			return emprestimos;

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;

	}

	public static Map<ChaveNomeTelefone, Usuario> carregaUsuarios() {

		try {

			FileInputStream fis = new FileInputStream("data/usuarios.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			Map<ChaveNomeTelefone, Usuario> usuarios = (Map<ChaveNomeTelefone, Usuario>) ois.readObject();

			ois.close();
			return usuarios;

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;

	}

	public static void salvarUsuarios(Map<ChaveNomeTelefone, Usuario> usuarios) {

		try {

			FileOutputStream fos = new FileOutputStream("data/usuarios.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);

			oos.writeInt(usuarios.size());
			oos.writeObject(usuarios);
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> lessons = new ArrayList<>();

		System.out.println("PLATAFORMA DE ENSINO");
		System.out.println();
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.printf("DADOS DA %dª AULA:\n", (i + 1));
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			String type = sc.nextLine();
			System.out.print("Título: ");
			String title = sc.nextLine();

			switch (type.toLowerCase()) {
			case "c":
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();

				lessons.add(new Video(title, url, seconds));
				break;

			case "t":
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();

				lessons.add(new Task(title, description, questionCount));
				break;
			}
			sc.nextLine();
			System.out.println();
		}
		
		int sum = 0;

		for (Lesson lesson : lessons) {
			sum += lesson.duration();
		}
		
		System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos", sum);

		sc.close();
	}

}

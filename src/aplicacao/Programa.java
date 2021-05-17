package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1= new Comment(" Have a nice trip!"); //c1 objeto
		Comment c2= new Comment("Wow that s awesome!"); //c2 objeto
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Travelin to New Zealand","Vou visitar este pais maravilhoso",12);//instanciei o Post
		//adicionar os dois comentários
		p1.addComment(c1);
		p1.addComment(c2);
		

		Comment c3= new Comment(" Boa noite!"); //c1 objeto
		Comment c4= new Comment("Como vai você!"); //c2 objeto
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Muito bom guri",
				"Vou visitar este pais",5);//instanciei o Post
		//adicionar os dois comentários
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		System.out.println(p1);
		System.out.println(p2);

	}

}

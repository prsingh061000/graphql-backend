package com.graphql.backend;

import com.graphql.backend.entities.Book;
import com.graphql.backend.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlBackendApplication.class, args);
	}

	@Autowired
	private BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		Book[] books = new Book[50];



		String[] titles = {
				"To Kill a Mockingbird", "1984", "Harry Potter and the Sorcerer's Stone", "The Great Gatsby", "The Catcher in the Rye",
				"The Hobbit", "Fahrenheit 451", "Pride and Prejudice", "The Kite Runner", "The Book Thief",
				"The Hunger Games", "The Chronicles of Narnia", "Brave New World", "Animal Farm", "Gone with the Wind",
				"The Lord of the Rings", "Jane Eyre", "The Da Vinci Code", "The Alchemist", "Memoirs of a Geisha",
				"The Little Prince", "Life of Pi", "A Game of Thrones", "The Fault in Our Stars", "The Girl on the Train",
				"The Help", "The Handmaid's Tale", "The Shining", "Wuthering Heights", "The Secret Garden",
				"Moby Dick", "The Odyssey", "A Tale of Two Cities", "Crime and Punishment", "War and Peace",
				"The Catch-22", "The Picture of Dorian Gray", "Dracula", "Frankenstein", "The Adventures of Huckleberry Finn",
				"The Scarlet Letter", "Great Expectations", "Les Misérables", "Don Quixote", "Ulysses",
				"Alice's Adventures in Wonderland", "The Brothers Karamazov", "One Hundred Years of Solitude", "Madame Bovary", "The Iliad"
		};

		String[] authors = {
				"Harper Lee", "George Orwell", "J.K. Rowling", "F. Scott Fitzgerald", "J.D. Salinger",
				"J.R.R. Tolkien", "Ray Bradbury", "Jane Austen", "Khaled Hosseini", "Markus Zusak",
				"Suzanne Collins", "C.S. Lewis", "Aldous Huxley", "George Orwell", "Margaret Mitchell",
				"J.R.R. Tolkien", "Charlotte Brontë", "Dan Brown", "Paulo Coelho", "Arthur Golden",
				"Antoine de Saint-Exupéry", "Yann Martel", "George R.R. Martin", "John Green", "Paula Hawkins",
				"Kathryn Stockett", "Margaret Atwood", "Stephen King", "Emily Brontë", "Frances Hodgson Burnett",
				"Herman Melville", "Homer", "Charles Dickens", "Fyodor Dostoevsky", "Leo Tolstoy",
				"Joseph Heller", "Oscar Wilde", "Bram Stoker", "Mary Shelley", "Mark Twain",
				"Nathaniel Hawthorne", "Charles Dickens", "Victor Hugo", "Miguel de Cervantes", "James Joyce",
				"Lewis Carroll", "Fyodor Dostoevsky", "Gabriel Garcia Marquez", "Gustave Flaubert", "Homer"
		};

		String[] descriptions = {
				"A novel about the serious issues of rape and racial inequality.",
				"A dystopian social science fiction novel and cautionary tale about the future.",
				"A young wizard's journey to find his place in the magical world.",
				"A story about the American dream and the roaring twenties.",
				"A teenage boy's experiences and his personal struggles.",
				"A hobbit's adventure to reclaim a lost kingdom and treasure.",
				"A story about a future society where books are banned.",
				"A romantic novel about the manners and matrimonial machinations.",
				"A novel about friendship and redemption set in Afghanistan.",
				"A historical novel set during World War II.",
				"A dystopian novel about a deadly competition for survival.",
				"A fantasy series set in the magical land of Narnia.",
				"A dystopian novel exploring the impact of technology on society.",
				"A satirical novella about a group of farm animals.",
				"A historical romance set during the American Civil War.",
				"An epic high fantasy novel set in Middle-earth.",
				"A novel about a young woman's experiences and personal growth.",
				"A mystery thriller about a conspiracy in the Catholic Church.",
				"A philosophical novel about a shepherd's journey to find treasure.",
				"A novel about a young girl's transformation into a geisha.",
				"A poetic tale about a young prince's journey through the universe.",
				"A novel about a young boy's survival at sea with a Bengal tiger.",
				"A fantasy novel set in the medieval-inspired land of Westeros.",
				"A novel about two teenagers with cancer who fall in love.",
				"A psychological thriller about a woman who sees something shocking.",
				"A novel about African American maids working in white households.",
				"A dystopian novel about a theocratic regime in the United States.",
				"A horror novel about a haunted hotel and a writer's descent into madness.",
				"A novel about a tragic love story set on the Yorkshire moors.",
				"A children's novel about an orphan girl who discovers a hidden garden.",
				"A novel about a captain's obsession with hunting a giant whale.",
				"An epic poem about the adventures of Odysseus.",
				"A historical novel set in Paris and London before and during the French Revolution.",
				"A novel about the mental anguish and moral dilemmas of a man.",
				"An epic novel about the French invasion of Russia.",
				"A satirical novel about the absurdities of war.",
				"A novel about a man who remains young while a portrait of him ages.",
				"A Gothic horror novel about a vampire.",
				"A Gothic novel about a scientist who creates a monster.",
				"A novel about a boy's adventures on the Mississippi River.",
				"A novel about sin, guilt, and redemption in Puritan New England.",
				"A novel about the life and growth of an orphan named Pip.",
				"A historical novel about the struggles of the poor in France.",
				"A novel about a man who dreams of becoming a knight.",
				"A modernist novel about a day in the life of an ordinary man.",
				"A fantasy novel about a young girl's adventures in a magical world.",
				"A philosophical novel about faith, doubt, and reason.",
				"A novel about the Buendía family in the fictional town of Macondo.",
				"A novel about a woman's adulterous affair in provincial France.",
				"An epic poem about the Trojan War."
		};

		int[] pages = {
				324, 328, 309, 180, 277, 310, 194, 279, 371, 552,
				374, 767, 268, 112, 1037, 1178, 500, 689, 208, 434,
				96, 354, 694, 313, 395, 451, 311, 447, 416, 280,
				635, 541, 489, 671, 1225, 453, 254, 418, 280, 366,
				272, 544, 1463, 940, 730, 124, 796, 417, 329, 704
		};

		int[] prices = {
				1500, 1200, 2000, 1300, 1100, 1400, 1000, 1600, 1700, 1500,
				1800, 2200, 1200, 900, 1800, 2500, 1300, 2100, 1100, 1900,
				800, 1400, 2300, 1200, 1600, 1700, 1300, 1800, 1500, 1200,
				1400, 1200, 1300, 1700, 2000, 1500, 1600, 1800, 1100, 1400,
				1200, 1500, 1900, 2000, 2100, 800, 1700, 1900, 1600, 1800
		};

		for (int i = 0; i < 50; i++) {
			books[i] = new Book();
			books[i].setTitle(titles[i]);
			books[i].setDesc(descriptions[i]);
			books[i].setPages(pages[i]);
			books[i].setPrice(prices[i]);
			books[i].setAuthor(authors[i]);
			this.bookService.create(books[i]);

		}


	}
}

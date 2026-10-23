public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author("Pepito", "pepito@gmail.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        Book anotherBook = new Book("more Java for dummy", new Author("Matilda", "matilda@hotmail.com", 'f'), 29.95, 888);

        System.out.println("Name: " + aBook.getAuthor().getName() + " - Email: " + aBook.getAuthor().getEmail());

        Book[] array = new Book[5];

        array[0] = new Book("papas pizza", new Author("Juan", "juanwrite@hotmail.com", 'm'), 29.95, 5);
        array[1] = new Book("new world", new Author("Mike", "mike@gmail.com", 'm'), 19.95, 3);
        array[2] = new Book("pure C #1", new Author("Darwin", "darwinedits@yahoo.com", 'm'), 30.95, 657);
        array[3] = new Book("pure C #2", new Author("Darwin", "darwinedits@yahoo.com", 'm'), 30.95, 546);
        array[4] = new Book("geology master", new Author("Paola", "paola@outlook.com", 'f'), 10.95, 46);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

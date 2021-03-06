package exercise4.objects;

import java.util.Comparator;

import static exercise4.objects.TitleComparator.stringCompare;

/**
 * Created by Viktoryia_Kastsiukov on 10/4/2016.
 */
public class AuthorTitleComparator implements Comparator<Book> {
    public int compare(Book o1, Book o2) {
        if(stringCompare(o1.getAuthor(), o2.getAuthor()) == 0){
            return (stringCompare(o1.getTitle(), o2.getTitle()));
        } else {
            return stringCompare(o1.getAuthor(), o2.getAuthor());
        }
    }
}

public class Main {
    public static Movie[] getMovies() {
        return new Movie[] {
                new Movie("John Wick", 2015, 18),
                new Movie("Aliens", 1986, 14),
                new Movie("Mad Max: Fury Road", 2015, 18),
                new Movie("The Matrix", 1999, 16),
                new Movie("The Conjuring", 2013, 18),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[] {
                new Theatre("Hamlet", 2023, 14),
                new Theatre("Long Day's Journey Into Night", 2015, 14),
                new Theatre("Death of a Salesman", 2018, 16),
                new Theatre("Angels in America", 2010, 17),
                new Theatre("Woyzeck", 2013, 18),
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAgeLimit() == 0) {
            throw new RuntimeException("Validation of event is failed");
        }
    }

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}

public abstract class Event {
    private String title;
    private int releaseYear;
    private int ageLimit;

    public Event(String title, int releaseYear, int ageLimit) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.ageLimit = ageLimit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }


    @Override
    public String toString() {
        return "Title: " + title + " | Released year: " + releaseYear + " | Age: " + ageLimit;
    }

}

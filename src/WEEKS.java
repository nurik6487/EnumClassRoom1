public enum WEEKS {
    MONDAY("Дуйшомбу куну zoom сабагы"),
    Tuesday("Шейшимби куну сейшин сабагы"),
    Wednesday("Шаршемби zoom сабагы"),
    Thursday("Бейшемби сейшын сабагы"),
    Friday("Жума zoom сабагы"),
    Saturday("Ишемби англис тили"),

    Sunday("Жекшемби дем алыш кечинде футбол");

    private final String weeks;

    WEEKS(String weeks){
        this.weeks=weeks;
    }
    public String getWeeks() {
        return weeks;
    }

    @Override
    public String toString() {
        return "WEEKS: " +"\n"+
                 weeks + "\n";
    }
}

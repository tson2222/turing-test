import java.util.Date;

public class DummyMeta {

    Date date;

    public DummyMeta() {
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "DummyMeta{" +
                "date=" + date +
                '}';
    }
}



class DummyObject {

    int id;

    public DummyObject(DummyObject another) {
        this.id = another.id; // you can access
        this.name = another.name;
    }
    public DummyObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        System.out.println("fu");
        if(name == null){
            return null;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
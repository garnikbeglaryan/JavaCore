package education;

public class LessonStorage {

    Lesson [] lessons = new Lesson[10];
    int size;

    public void add(Lesson lesson){
        if(lessons.length == size){
            extend();
        }
        lessons[size++] = lesson;

    }

    private void extend() {
        Lesson [] array = new Lesson[lessons.length + 10];
        System.arraycopy(lessons,0,array,0,array.length +10);
        lessons = array;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i] + " ");
        }
    }

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if(lessons[i].getName().equals(name)){
                return lessons[i];
            }
        }
        return null;
    }

    public void deleteBylesson(String name) {
        for (int i = 0; i < size; i++) {
            if(lessons[i].getName().equals(name)){
                delete(i);
            }
        }

    }

    private void delete(int index){
        for (int i =index + 1 ; i < size; i++) {
            lessons[i - 1] = lessons[i];
        }
        size--;
    }
}

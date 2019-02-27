package BoxTester;

public class Box3 {
    float lenght = 23;
    float width = 14;
    int height = 13;

    public boolean validate(float length, float width, int height) {
        if (this.lenght > length && this.width > width && this.height > height)
            return true;
        return false;
    }
}

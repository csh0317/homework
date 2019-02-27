package BoxTester;

public class Box5 {
    float lenght = 39.5f;
    float width = 27.5f;
    int height = 23;

    public boolean validate(float length, float width, int height) {
        if (this.lenght > length && this.width > width && this.height > height)
            return true;
        return false;
    }
}

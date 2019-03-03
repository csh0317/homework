package BoxTester;

public class Box  {
    float length;
    float width;
    int height;

    public boolean validate(float length, float width, int height) {
        if (this.length > length && this.width > width && this.height > height)
            return true;
        return false;
    }

    public Box(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

}

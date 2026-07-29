class Box {

    double width;
    double height;
    double depth;

    Box() {
        width = height = depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo1 {
    public static void main(String args[]) {

        double vol;

        Box myBox = new Box();

        vol = myBox.volume();

        System.out.println("Volume is : " + vol);
    }
}
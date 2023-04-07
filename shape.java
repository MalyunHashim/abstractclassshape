package abstractclassshape;

abstract class shape {
    abstract void draw();
}
class rectangle extends shape{
  void draw(){
      System.out.println("drawing rectangle");
  }
}

class circle extends shape{
    void draw(){
        System.out.println("drawing circle" );

    }
}
class triangle extends shape{
    void draw() {
        System.out.println("drawing triangle");
    }
}
class square extends shape{
    void draw(){
        System.out.println("drawing square");
    }
}

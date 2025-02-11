public class Circle extends Shape implements Movable{

        protected double radius;
        private int x, y;
        private final double PI = Math.PI;

        public Circle(int x, int y, double radius){
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public Circle(double radius){
            this.radius = radius;
        }

        public Circle(double radius, double height){
            this.radius = radius;
//            super.height = height;
        }

        @Override
    public double getArea(){
            double area = PI * Math.pow(this.radius, 2);
            return area;
        }

    @Override
    public double egtArea() {
        return 0;
    }

    @Override
    public void displayshapName(){
            System.out.println("Drawing a Circle of radius " + this.radius);
        }

        public String getCoordinate(){
            return "(" + x + "," + y + ")";
        }

    @Override
    public String someThing() {
        return "";
    }

    @Override
    public void moveUp(){
            y++;
        }

        @Override
    public void moveDown(){
            y--;
        }

        @Override
    public void moveLeft(){
            x--;
        }

        @Override
    public void moveRight(){
            x++;
        }
}

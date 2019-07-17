
class Darts {
    double r;
    Darts(double x, double y) {
        this.r=squareRoot(x,y);
    }
    double squareRoot(double x,double y)
    {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    int score() {
        if(this.r>10)
            return 0;
        else if(this.r>5)
            return 1;
        else if(this.r>1)
            return 5;
        else if(this.r<=1)
            return 10;
        return 0;
    }

}

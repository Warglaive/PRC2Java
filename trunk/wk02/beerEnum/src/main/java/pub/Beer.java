package pub;

//@author urs
class Beer {

    private double size;
    private DrinkType type;

    public Beer(DrinkType type) {
        this.type = type;
        switch (this.type) {
            case SMALL:
                this.size = 0.2;
                break;
            case LARGE:
                this.size = 1.0;
                break;
            case PINT:
                this.size = 0.57;
                break;
        }

    }

    public double getSize() {
        return this.size;
    }

    public DrinkType getType() {
        return this.type;
    }
}

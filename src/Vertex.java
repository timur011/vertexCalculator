public class Vertex {
    private String formula;

    public Vertex(String formula){
        this.formula = formula;
    }

    public double getX(){
        String temp = formula.substring(0, formula.indexOf("^"));
        boolean positive = true;
        int firstLoc = 0;
        if(temp.contains("+")){
            firstLoc = temp.indexOf("+");
        }
        else if(!temp.contains("+")){
            firstLoc = temp.indexOf("-");
            positive = false;
        }
        if(positive) {
            return -1 * Double.parseDouble(temp.substring((firstLoc + 1), temp.indexOf(")")));
        }
        else if(!positive){
            return Double.parseDouble(temp.substring((firstLoc + 1), temp.indexOf(")")));
        }
        return 0;

    }

    public double getY(){
        String temp2 = formula.substring(formula.indexOf("^"));
        int yLoc = 0;
        boolean up = true;
        if(temp2.contains("+")){
            yLoc = temp2.indexOf("+");
        }
        else if(!temp2.contains("+")) {
            yLoc = temp2.indexOf("-");
            up = false;
        }
        else{
            return 0;
        }
        if(up) {
            return Double.parseDouble(temp2.substring(yLoc + 1));
        }
        else if(!up){
            return -1 * Double.parseDouble(temp2.substring(yLoc + 1));
        }else{
            return 0;
        }

    }


    public void present(){
        System.out.println("The vertex of the formula is (" + getX() + ", " + getY() + ")");
    }




}
